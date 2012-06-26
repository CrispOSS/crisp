package nl.cwi.crisp.examples.elevator.scala

import java.lang.Object
import java.util.Collection
import java.util.Random
import java.util.Timer
import java.util.TimerTask
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

import scala.collection.mutable.Buffer
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap

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
import akka.routing.BroadcastRouter
import akka.routing.RoundRobinRouter
import akka.routing.SmallestMailboxRouter

import nl.cwi.crisp.api.akka.CrispActor
import nl.cwi.crisp.api.akka.PriorityMessage

case class ElevatorRequest(floor: Int, sched: () => Int) extends SchedulableMessage(Some(1), sched)
case class ElevatorArrival(floor: Int, sched: () => Int) extends SchedulableMessage(Some(1), sched)
case class ElevatorStat(name: String, requests: Int)
case class PassengerStat(floor: Int, time: Long)
case object Stop

class Elevator() extends Actor {

	val motor: Motor = new Motor()
	val motorStarted: AtomicBoolean = new AtomicBoolean(false)
	val moving: AtomicBoolean = new AtomicBoolean(false)
	
	val r: Random = new Random
	val floor: AtomicInteger = new AtomicInteger(r.nextInt(Building.topFloor) + 1)
	val direction: AtomicBoolean = new AtomicBoolean(if (Math.random > 0.5) true else false)
	
	var requests: List[Int] = List()
	var controller: ActorRef = null
	val stats: ActorRef = context.actorFor("akka://building/user/stats") 
	
	def receive = {
		case ElevatorRequest(floor: Int, sched: Function0[Int]) => {
			if (!moving.get()) {
				direction.set(if (this.floor.get() < floor) true else false)
				moving.compareAndSet(false, true)
				if (!motorStarted.get()) {
					motor.start()
					motorStarted.compareAndSet(false, true)
				}
			}
			requests = floor :: requests
			controller = sender
			//println(self.path.name + "," + requests.length)
			stats ! ElevatorStat(self.path.name, requests.length)
		}
	}
	
	def announce() = {
		requests = requests.filter((n) => n != floor.get())
		if (requests.length == 0) {
			moving.compareAndSet(true, false)
		}
		controller ! ElevatorArrival(floor.get(), elevSched)
	}

	def elevSched(): Int = {
		100 - floor.get / requests.length
	}
	
	class Motor extends Thread {
		
		override def run = {
			while (moving.get()) {
				floor.addAndGet(if (direction.get()) 1 else -1)
				if (floor.get() == Building.topFloor)
					direction.compareAndSet(true, false)
				if (floor.get() == Building.groundFloor)
					direction.compareAndSet(false, true)
				announce()
				Thread.sleep(300)
				//println("motor: " + self.path.name)
			}
		}
	
	}
}

class Passenger() extends Actor {

	val r: Random = new Random
	val from: AtomicInteger = new AtomicInteger(r.nextInt(Building.topFloor) + 1)
	val to: AtomicInteger = new AtomicInteger(r.nextInt(Building.topFloor) + 1)
	
	val onElevator: AtomicBoolean = new AtomicBoolean(false)
	var fromTime: Long = 0
	var toTime: Long = 0
	
	val stats: ActorRef = context.actorFor("akka://building/user/stats")
	
	def receive = {
		case ElevatorArrival(floor: Int, sched: Function0[Int]) => {
			//println("arrival p: " + floor)
			if (onElevator.get()) {
				if (to.get() == floor) {
					toTime = System.currentTimeMillis
					stats ! PassengerStat(Math.abs(from.get() - to.get()), toTime - fromTime)
					from.set(r.nextInt(Building.topFloor) + 1)
					to.set(r.nextInt(Building.topFloor) + 1)
					if (from.get == to.get) {
						to.set((to.get + 1) % Building.topFloor + 1)
					}
					fromTime = 0 
					toTime = 0
					onElevator.compareAndSet(true, false)
					sender ! ElevatorRequest(from.get(), passSched)
				}
			} else {
				if (from.get() == floor) {
					fromTime = System.currentTimeMillis
					onElevator.compareAndSet(false, true)
				}
			}
		}
	}

	// SJF
	def passSchedSJF(): Int = {
		-(to.get - from.get)
	}
	
	// FCFS
	def passSchedFCFS(): Int = {
		(System.currentTimeMillis.toLong - fromTime.toLong).toInt
	}
	
	def passSched(): Int = passSchedFCFS

}

class Controller(val elevators: ActorRef, val passengers: ActorRef) extends Actor {

	val start = System.currentTimeMillis

	def receive = {
		case ElevatorArrival(floor: Int, sched: Function0[Int]) => {
			// println("arrival: " + floor)
			passengers ! ElevatorArrival(floor, sched)
		}
		case ElevatorRequest(floor: Int, sched: Function0[Int]) => {
			// println("request: " + floor)
			elevators ! ElevatorRequest(floor, sched)
		}
	}

}

class Stats extends Actor {

	val pstats: HashMap[Int, ListBuffer[Long]] = HashMap.empty[Int, ListBuffer[Long]]
	val estats: HashMap[String, ListBuffer[Int]] = HashMap.empty[String, ListBuffer[Int]]
	
	def receive = {
		case PassengerStat(floors: Int, time: Long) => {
			if (!pstats.contains(floors)) 
				pstats += floors -> new ListBuffer[Long]()
			pstats(floors).append(time)
		}
		case ElevatorStat(name: String, requests: Int) => {
			if (!estats.contains(name))
				estats += name -> new ListBuffer[Int]()
			estats(name).append(requests)
		}
        case Stop => {
                pstats.foreach { case (k, v) =>
                        var sb = new StringBuilder()
                        println(Building.topFloor + ",B" + k + "," + v.addString(sb, ",").toString)
                }
                estats.foreach { case (k, v) =>
                        var sb = new StringBuilder()
                        println(Building.topFloor + "," + k + "," + v.addString(sb, ",").toString)
                }
                context.system.shutdown
                System.exit(0)
        }
	}
}

object Building {

	var topFloor: Int = -1
	val groundFloor: Int = 1

	val system: ActorSystem = ActorSystem("building")
	val r: Random = new Random
	
	def start(floors: Int, delay: Int) = {
	
		topFloor = floors
		val passengerNum = floors * 25
		val elevatorNum = Math.floor(Math.sqrt(floors)).toInt 
	
		val stats = system.actorOf(Props(new Stats()), name = "stats")

		val passengers = system.actorOf(Props[Passenger]
			.withRouter(BroadcastRouter(passengerNum, routerDispatcher = "router"))
			.withDispatcher("BD")
			)
		
		val elevators = system.actorOf(Props[Elevator]
			.withRouter(BroadcastRouter(5, routerDispatcher = "router"))
			.withDispatcher("BD")
			)
			
		val controller = system.actorOf(Props(new Controller(elevators, passengers)), name = "controller")
		controller ! ElevatorRequest(r.nextInt(topFloor) + 1, () => 1)
		
		val task = new TimerTask() {
			def run() = {
				stats ! Stop
			}
		}
		val timer = new Timer()
		timer.schedule(task, delay * 60 * 1000L)
	}	
	
}

object Main {
	def main(args: Array[String]) {
		Building.start(Integer.valueOf(args(0)), Integer.valueOf(args(1)))
	}
}


