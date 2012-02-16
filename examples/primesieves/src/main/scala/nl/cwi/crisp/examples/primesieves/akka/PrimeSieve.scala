package nl.cwi.crisp.examples.primesieves.akka

import akka.actor._
import akka.actor.Actor._

case class sieve(n: Int)
case class finish(n: Int)

class Sieve(val p: Int) extends Actor {

  var next: ActorRef = null

  def _sieve(n: Int) = {
    if (isPrime(n)) {
      if (next != null) {
        next ! sieve(n)
      } else {
        next = actorOf(new Sieve(n))
        next.start
        // println(n + " is prime")
      }
    }
  }

  private def isPrime(n: Int): Boolean = {
    val d = n / p
    val r = n - d * p
    if (r != 0) true else false
  }

  def receive = {
    case sieve(n: Int) => _sieve(n) 
    case finish(n: Int) => {
    	if (next != null) {
    		next ! finish(n)
    	} else {
    		val time = System.currentTimeMillis - Main.start
    		println(n + "," + time)
    		System.exit(0)
    	}
    }
    
  }

}

object Generator {

  def generate(n: Int): Unit = {
    val p2 = actorOf(new Sieve(2))
    p2.start
    for (i <- 3 to n) {
    	p2 ! sieve(i)
    }
    p2 ! finish(n)
  }
}

object Main {

	var start = System.currentTimeMillis
	
	def main(args: Array[String]): Unit = {
		start = System.currentTimeMillis
		Generator.generate(Integer.valueOf(args(0)))
	}
}

