package nl.cwi.crisp.examples.p2p.scala

import scala.util.Random
import akka.actor.Actor
import akka.actor.ActorRef
import scala.collection.mutable.ListBuffer

case object Start

class User(val network: ActorRef, val id: String) extends Actor {

  val r: Random = new Random
  val queries: ListBuffer[_search] = new ListBuffer
  var startTime: Long = _
  var responses: Long = 0
  var time: Long = _

  override def preStart = {
    super.preStart
    for (i <- 1 to 100) {
      val q = "_" + r.nextInt(100)
	  //val p = (System.currentTimeMillis - startTime).toInt
	  val p = q.hashCode
      queries += _search(q, Some(p))
    }
  }

  def receive = {
    case Start => {
      startTime = System.currentTimeMillis
      queries.foreach(q => {
        network ! q
      })
    }
    case _ => {
      responses = responses + 1
      if (responses == queries.size) {
        time = System.currentTimeMillis - startTime
        //println(id + "," + (time));
        network ! ClientDone(time)
      }
    }
  }

}