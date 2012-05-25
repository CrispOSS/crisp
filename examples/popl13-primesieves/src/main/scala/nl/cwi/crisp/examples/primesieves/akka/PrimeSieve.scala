package nl.cwi.crisp.examples.primesieves.akka

import akka.actor._
import akka.actor.ActorRef
import akka.actor.Props

case class sieve(n: Int)
case class finish(n: Int)

class Sieve(val p: Int) extends Actor {
  
  var next: ActorRef = null

  def _sieve(n: Int) = {
    if (isPrime(n)) {
      if (next != null) {
        next ! sieve(n)
      } else {
        next = context.actorOf(Props(new Sieve(n)), name = "Sieve_" + n)
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

  val system = ActorSystem("PrimeSieves")
  
  def generate(n: Int): Unit = {
    val p2 = system.actorOf(Props(new Sieve(2)), name = "Sieve_2")
    // system.start(p2)
    for (i <- 3 to n) {
    	p2 ! sieve(i)
    }
    p2 ! finish(n)
    // need to receive the end
  }
}

object Main {

	var start = System.currentTimeMillis
	
	def main(args: Array[String]): Unit = {
		start = System.currentTimeMillis
		Generator.generate(Integer.valueOf(args(0)))
	}
}

