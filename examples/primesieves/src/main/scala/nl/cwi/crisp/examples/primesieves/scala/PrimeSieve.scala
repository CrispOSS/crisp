package nl.cwi.crisp.examples.primesieves.scala

import scala.actors.Actor

case class sieve(n: Int)
case class finish(n: Int)

class Sieve(val p: Int) extends Actor {

  var next: Sieve = null

  def _sieve(n: Int) = {
    if (isPrime(n)) {
      if (next != null) {
        next ! sieve(n)
      } else {
        next = new Sieve(n)
        next.start
        println(n + " is prime")
      }
    }
  }

  private def isPrime(n: Int): Boolean = {
    val d = n / p
    val r = n - d * p
    if (r != 0) true else false
  }

  def act = {
  	loop {
  		react {
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
  }

}

object Generator {

  def generate(n: Int): Unit = {
    val p2 = new Sieve(2)
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

