package nl.cwi.crisp.examples.p2p.scala

import java.lang.Object
import java.util.Collection
import java.util.Random

import scala.collection.JavaConversions._

import akka.actor.actorRef2Scala
import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props
import akka.dispatch.Await
import akka.dispatch.Future
import akka.pattern.ask
import akka.util.duration.intToDurationInt
import akka.util.Timeout
import nl.cwi.crisp.api.akka.CrispActor
import nl.cwi.crisp.api.akka.PriorityMessage
import nl.cwi.crisp.examples.p2p.Client
import nl.cwi.crisp.examples.p2p.Peer
import nl.cwi.crisp.examples.p2p.Storage

class Node(val id: String, val storage: Storage) extends Actor {

  var peers: List[ActorRef] = List()
  
  def getId = id

  def receive = {
    // serving requests
    case _list(p: Option[Int]) => {
      sender ! this.list()
    }
    case _download(fileName: String, p: Option[Int]) => {
      sender ! _file(this.download(fileName))
    }
    case _upload(fileName: String, file: Object, p: Option[Int]) => {
      this.upload(fileName, file)
    }
    case _search(query: String, p: Option[Int]) => {
      sender ! _files(this.search(query))
    }
    case _register(peer: ActorRef, p: Option[Int]) => {
      peers = peer :: peers
      sender ! None	
    }
    // processing responses
    case _files(peerList: Collection[String], p: Option[Int]) => {
      // A listing is received
      // println("Received [" + sender + "] listing: " + peerList)
    }
    case _clients(searchResult: Collection[ActorRef], p: Option[Int]) => {
      // The list of Clients having the query
      // println("Received search result from [" + sender + "]: " + searchResult)
    }
    case _file(file: Object, p: Option[Int]) => {
      // Received a download
      // println("Download a file: " + file.getClass())
    }
  }

  // Client

  def list(): Collection[String] =
    storage.list()

  def download(fileName: String): Object =
    storage.load(fileName)

  def upload(fileName: String, file: Object) {
    storage.persist(fileName, file)
  }

  // Server

  def search(query: String): Collection[String] = {
    var result: List[String] = List[String]()
    this.list().toList.foreach { q =>
    	if (q.contains(query)) {
    		result = query :: result
    	}
    }
    implicit val timeout = Timeout(1 hour)
    // println("[" + this + "]'s peers: " + peers)
    for (p <- peers) {
      // println("asking [" + p + "] for [" + query + "]")
      val tmp: Future[Collection[String]] = ask(p.asInstanceOf[ActorRef], _list()).mapTo[Collection[String]]
      val l = Await.result(tmp, timeout.duration).asInstanceOf[Collection[String]]
      l.toList.foreach { q =>
      	if (q.contains(query)) {
      		result = q :: result
      	}
      }
    }
    result.toList
  }

}

sealed case class _list(var p: Option[Int] = None) extends PriorityMessage(p)
sealed case class _download(val fileName: String, var p: Option[Int] = None) extends PriorityMessage(p)
sealed case class _upload(val fileName: String, val file: Any, var p: Option[Int] = None) extends PriorityMessage(p)
sealed case class _search(val query: String, var p: Option[Int] = None) extends PriorityMessage(p)
sealed case class _register(val peer: ActorRef, var p: Option[Int] = None) extends PriorityMessage(p)
// Messages for responses
sealed case class _files(val files: Collection[String], var p: Option[Int] = None) extends PriorityMessage(p)
sealed case class _clients(val files: Collection[ActorRef], var p: Option[Int] = None) extends PriorityMessage(p)
sealed case class _file(val file: Object, var p: Option[Int] = None) extends PriorityMessage(p)

class Network() extends Actor {

  def this(name: String) = {

    this()

	val r = new Random
	var myList = for (i <- List.range(0, 1000)) yield ("file_" + r.nextInt(100) + "")
    val db1 = new DummyStorage(myList)
	myList = for (i <- List.range(0, 1000)) yield ("file_" + r.nextInt(100) + "")
    val db2 = new DummyStorage(myList)

    val s1 = context.actorOf(Props(new Node("s1", db1)), name = "s1")
    val s2 = context.actorOf(Props(new Node("s2", db2)), name = "s2")

    val c1 = context.actorOf(Props(new Node("c1", db1)), name = "c1")
    val c2 = context.actorOf(Props(new Node("c2", db1)), name = "c2")
    val c3 = context.actorOf(Props(new Node("c3", db1)), name = "c3")
    val c4 = context.actorOf(Props(new Node("c4", db2)), name = "c4")
    val c5 = context.actorOf(Props(new Node("c5", db2)), name = "c5")
    val c6 = context.actorOf(Props(new Node("c6", db2)), name = "c6")
    val c7 = context.actorOf(Props(new Node("c7", db1)), name = "c7")
    val c8 = context.actorOf(Props(new Node("c8", db2)), name = "c8")

    implicit val timeout = Timeout(5 second)
    
    s1 ? _register(c1)
    s1 ? _register(c2)
    s1 ? _register(c3)
    s2 ? _register(c4)
    s2 ? _register(c5)
    s2 ? _register(c6)
    c1 ? _register(c7)
    val lastRegistered = c4 ? _register(c8)
	Await.ready(lastRegistered, timeout.duration)

	var start = System.currentTimeMillis
	var n = 100
	for (i <- List.range(1, n-1)) {
	    s1 ! _search("14")
	}
	val lastSearch = s1 ? _search("14")
	Await.ready(lastSearch, Timeout(1000 hour).duration)
	var end = System.currentTimeMillis
	println(n + "," + (end - start))
	
	context.system.shutdown()
	
  }

  def receive = {
    case _files(l: Collection[String], p: Option[Int]) => {
      println("Application received file list: " + l + " from: " + sender)
    }
    case _clients(c: Collection[ActorRef], p: Option[Int]) => {
      println("Application search result: " + c + " from: " + sender)
    }
  }

}

object Main {

  val system = ActorSystem("main")

  def main(args: Array[String]): Unit = {
    val app = system.actorOf(Props(new Network("p2p")), name = "p2p")
  }

}
