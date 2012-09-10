package nl.cwi.crisp.examples.p2p.scala

import scala.util.Random
import akka.actor.Actor
import akka.actor.ActorRef
import scala.collection.mutable.ListBuffer
import java.util.concurrent.atomic.AtomicBoolean

case object Start

class User(val network: ActorRef, val id: String) extends Actor {

  val r: Random = new Random
  val queries: ListBuffer[_search] = new ListBuffer
  var startTime: Long = _
  var responses: Long = 0
  var time: Long = _
  
  val methodChooser: Double = r.nextDouble
  val fcfs: AtomicBoolean = new AtomicBoolean(methodChooser <= 0.33)
  val random: AtomicBoolean = new AtomicBoolean(methodChooser > 0.33 && methodChooser < 0.66)
  val sjf: AtomicBoolean = new AtomicBoolean(methodChooser >= 0.66)

  override def preStart = {
    super.preStart
    for (i <- 1 to 100) {
      val q = "_" + r.nextInt(100 * 100)
	  val p = if (fcfs.get) (System.currentTimeMillis - startTime).toInt else if (sjf.get) (q.length) else r.nextInt(100 * 100) 
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
        network ! ClientDone(if (fcfs.get) "FCFS" else if (sjf.get) "SJF" else "RANDOM", time)
      }
    }
  }

}