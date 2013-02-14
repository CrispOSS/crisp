package nl.cwi.crisp.examples.p2p.scala

import java.lang.Object
import java.util.Collection
import java.util.Random
import java.util.concurrent.atomic.AtomicLong
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
import scala.collection.mutable.HashMap
import scala.collection.mutable.Map
import java.text.DecimalFormat

class Node(val id: String, val storage: Storage, msgs: AtomicLong, val clients: Long) extends Actor {

  var peers: List[ActorRef] = List()
  var doneClients = 0
  var totalTime: Long = 0
  
  val statsTime: Map[String, Long] = HashMap.empty[String, Long]
  val statsCount: Map[String, Int] = HashMap.empty[String, Int]
  val fmt: DecimalFormat = new DecimalFormat("#.###")
  
  def getId = id

  def receive = {
    case _search(query: String, p: Option[Int]) => {
      sender ! (this.search(query))
    }
    case _register(peer: ActorRef, p: Option[Int]) => {
      peers = peer :: peers
      sender ! None	
    }
    case searchResult: Collection[String] => {
    	println("received search result: " + searchResult + " from " + sender)
    }
    case ClientDone(method: String, time: Long) => {
      doneClients += 1
      totalTime += time
      if (!statsTime.contains(method))
        statsTime.put(method, 0L)
      if (!statsCount.contains(method))
        statsCount.put(method, 0)
      statsTime.put(method, time + statsTime.get(method).get)
      statsCount.put(method, 1 + statsCount.get(method).get)
      if (doneClients == clients) {
    	  statsTime.foreach { case (k, v) =>
    	      val c = statsCount.get(k).get
	    	  println(doneClients + "," + k + "," + c + "," + fmt.format(v.toDouble / c))
    	  }
    	  context.system.shutdown
    	  System.exit(0)
      }
    }
  }

  // Client
  def list(): Collection[String] =
    storage.list()


  // Server
  def search(query: String): Collection[String] = {
    var result: List[String] = List[String]()
    this.list().toList.foreach { q =>
    	if (q.contains(query)) {
    		result = q :: result
    	}
    }
    implicit val timeout = Timeout(10 hour)
    // println("[" + this + "]'s peers: " + peers)
    for (p <- peers) {
      //println("asking [" + p + "] for [" + query + "]")
      val tmp: Future[Collection[String]] = ask(p.asInstanceOf[ActorRef], _search(query)).mapTo[Collection[String]]
      msgs.incrementAndGet()
      val l = Await.result(tmp, timeout.duration).asInstanceOf[Collection[String]]
      // println("result is ready from " + p + " >>> " + this.getId)
      l.toList.foreach { q =>
      	if (q.contains(query)) {
      		result = q :: result
      	}
      }
    }
    // println(" result is ready: " + this + " : " + result)
    result.toList
  }

}

case class _search(val query: String, var p: Option[Int] = None)  extends PriorityMessage(p)
case class _register(val peer: ActorRef, var p: Option[Int] = None)  extends PriorityMessage(p)
case class ClientDone(val method: String, val time: Long) extends PriorityMessage(Some(0))

object Network {

  val system = ActorSystem("p2p")

  def run(clientSize: Int) = {

    val msgs: AtomicLong = new AtomicLong(0)

	val r = new Random
	var myList = for (i <- List.range(0, 5000)) yield ("file_" + r.nextInt(100) + "")
    val db1 = new DummyStorage(myList)
	myList = for (i <- List.range(0, 5000)) yield ("file_" + r.nextInt(100) + "")
    val db2 = new DummyStorage(myList)
    
    val root = system.actorOf(Props(new Node("root", db1, msgs, clientSize)), name = "root")

    val s1 = system.actorOf(Props(new Node("s1", db1, msgs, 0)), name = "s1")
    val s2 = system.actorOf(Props(new Node("s2", db2, msgs, 0)), name = "s2")

    val c1 = system.actorOf(Props(new Node("c1", db1, msgs, 0)), name = "c1")
    val c2 = system.actorOf(Props(new Node("c2", db1, msgs, 0)), name = "c2")
    val c3 = system.actorOf(Props(new Node("c3", db1, msgs, 0)), name = "c3")
    val c4 = system.actorOf(Props(new Node("c4", db2, msgs, 0)), name = "c4")
    val c5 = system.actorOf(Props(new Node("c5", db2, msgs, 0)), name = "c5")
    val c6 = system.actorOf(Props(new Node("c6", db2, msgs, 0)), name = "c6")
    val c7 = system.actorOf(Props(new Node("c7", db1, msgs, 0)), name = "c7")
    val c8 = system.actorOf(Props(new Node("c8", db2, msgs, 0)), name = "c8")
    
    implicit val timeout = Timeout(15 second)

    var registered = root ? _register(s1)
	Await.ready(registered, timeout.duration)
	registered = root ? _register(s2)    
	Await.ready(registered, timeout.duration)
    registered = s1 ? _register(c1)
	Await.ready(registered, timeout.duration)
    registered = s1 ? _register(c2)
	Await.ready(registered, timeout.duration)
    registered = s1 ? _register(c3)
	Await.ready(registered, timeout.duration)
    registered = s2 ? _register(c4)
	Await.ready(registered, timeout.duration)
    registered = s2 ? _register(c5)
	Await.ready(registered, timeout.duration)
    registered = s2 ? _register(c6)
	Await.ready(registered, timeout.duration)
    registered = c1 ? _register(c7)
	Await.ready(registered, timeout.duration)
    registered = c4 ? _register(c8)
	Await.ready(registered, timeout.duration)

	import akka.dispatch.ExecutionContext
	import system.dispatcher
	implicit val ec = ExecutionContext.fromExecutor(system.dispatcher)

	val clients = for(i <- 1 to clientSize) yield (system.actorOf(Props(new User(root, "c-" + i))))
	clients.foreach(c => c ! Start)
	var end = System.currentTimeMillis
	
  }

}

object Main {

  def main(args: Array[String]): Unit = {
    val app = Network.run(Integer.valueOf(args(0)))
  }
  
}

