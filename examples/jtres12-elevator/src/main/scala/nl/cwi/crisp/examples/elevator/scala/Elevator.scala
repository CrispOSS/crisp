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
import scala.collection.mutable.ArrayBuffer
import java.text.DecimalFormat

case class ElevatorRequest(floor: Int, sched: () => Int) extends SchedulableMessage(Some(1), sched)
case class ElevatorArrival(floor: Int, sched: () => Int) extends SchedulableMessage(Some(1), sched)
case class ElevatorStat(name: String, requests: Int)
case class PassengerStat(floor: Int, time: Long)
case class PassengerStat2(requests: Int, time: Long)
case class PassengerStat3(requests: Int, time: Long, method: String)
case object Stop
case object Restart extends SchedulableMessage(Some(0), null)
case object ControllerRestart
case object StatRestart
case object StatReport

class Elevator() extends Actor {

	var motor: Motor = new Motor()
	val motorStarted: AtomicBoolean = new AtomicBoolean(false)
	val moving: AtomicBoolean = new AtomicBoolean(false)
	
	val r: Random = new Random
	val floor: AtomicInteger = new AtomicInteger(r.nextInt(Building.topFloor) + 1)
	val initFloor: AtomicInteger = new AtomicInteger(floor.get)
	val direction: AtomicBoolean = new AtomicBoolean(if (Math.random > 0.5) true else false)
	val initDirection: AtomicBoolean = new AtomicBoolean(direction.get)
	
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
		case Restart => {
		  requests = List()
		  floor.set(initFloor.get)
		  direction.set(initDirection.get)
		  motorStarted.set(false)
		  moving.set(false)
		  motor = new Motor
		}
	}
	
	def announce(): Any = {
		requests = requests.filter((n) => n != floor.get())
		if (requests.length == 0) {
			moving.compareAndSet(true, false)
		}
		controller ! ElevatorArrival(floor.get(), elevSched)
	}

	def elevSched(): Int = {
		100 * 100 - floor.get / requests.length
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
				Thread.sleep(700)
				//println("motor: " + self.path.name)
			}
		}
	
	}
}

class Passenger() extends Actor {

	val r: Random = new Random
	val from: AtomicInteger = new AtomicInteger(r.nextInt(Building.topFloor) + 1)
	val to: AtomicInteger = new AtomicInteger(r.nextInt(Building.topFloor) + 1)
	val initFrom: AtomicInteger = new AtomicInteger(from.get)
	val initTo: AtomicInteger = new AtomicInteger(to.get)
	
	val onElevator: AtomicBoolean = new AtomicBoolean(false)
	var fromTime: Long = 0
	var toTime: Long = 0
	
	var elevatorRequests: Int = 0
	var lastElevatorArrivalRequestTime: Long = 0
	var elevatorArrivalWaitingTime: Long = 0
	
	val methodChooser: Double = r.nextDouble
	val random: AtomicBoolean = new AtomicBoolean(methodChooser < 0.33)
	val fcfs: AtomicBoolean = new AtomicBoolean(methodChooser >= 0.33 && methodChooser < 0.66)
	val sjf: AtomicBoolean = new AtomicBoolean(methodChooser >= 0.66)
	
	val useCache: AtomicBoolean = new AtomicBoolean(false)
	val cache: ArrayBuffer[Int] = new ArrayBuffer[Int]
	val cacheIndex: AtomicInteger = new AtomicInteger(0)
	
	
	val stats: ActorRef = context.actorFor("akka://building/user/stats")
	
	def receive = {
		case ElevatorArrival(floor: Int, sched: Function0[Int]) => {
			//println("arrival p: " + floor)
			if (onElevator.get()) {
				if (to.get() == floor) {
					toTime = System.currentTimeMillis
					stats ! PassengerStat(Math.abs(from.get() - to.get()), toTime - fromTime)
					if (useCache.get && cacheIndex.get < cache.length) {
						from.set(to.get)
						to.set(cache(cacheIndex.get))
						cacheIndex.incrementAndGet
					} else if (!useCache.get) {
						from.set(to.get)
						to.set(r.nextInt(Building.topFloor) + 1)
						cache.append(to.get)
					}
					if (!useCache.get || cacheIndex.get < cache.length) {
						fromTime = 0 
						toTime = 0
						onElevator.compareAndSet(true, false)
						sender ! ElevatorRequest(from.get(), passSched)
						elevatorRequests += 1
						elevatorArrivalWaitingTime += (System.currentTimeMillis - lastElevatorArrivalRequestTime)
						lastElevatorArrivalRequestTime = System.currentTimeMillis
						stats ! PassengerStat3(elevatorRequests, elevatorArrivalWaitingTime, method())
					}
				}
			} else {
				if (from.get() == floor) {
					fromTime = System.currentTimeMillis
					onElevator.compareAndSet(false, true)
				}
			}
		}
		case Restart => {
		  useCache.set(true)
		  cacheIndex.set(0)
		  elevatorRequests = 0
		  elevatorArrivalWaitingTime = 0
		  onElevator.set(false)
		  lastElevatorArrivalRequestTime = 0
		  fromTime = 0
		  toTime = 0
		  from.set(initFrom.get)
		  to.set(initTo.get)
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
	
	def passSched(): Int = 
		if (random.get) r.nextInt(100 * 100) else if (fcfs.get) passSchedFCFS() else passSchedSJF()
		
	def method(): String = 
	  	if (random.get) "RANDOM" else if (fcfs.get) "FCFS" else "SJF"

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
		case ControllerRestart => {
		  passengers ! Restart
		  elevators ! Restart
		  elevators ! ElevatorRequest(Building.firstFloorRequest, () => 1)
		}
		case Stop => {
		  context.system.shutdown
		  System.exit(0)
		}
	}

}

class Stats extends Actor {

	val pstats: HashMap[Int, ListBuffer[Long]] = HashMap.empty[Int, ListBuffer[Long]]
	val estats: HashMap[String, ListBuffer[Int]] = HashMap.empty[String, ListBuffer[Int]]
	val statRequests: HashMap[String, Int] = HashMap.empty[String, Int]
	val statWaitingTimes: HashMap[String, Long] = HashMap.empty[String, Long]
	
	val formatter: DecimalFormat = new DecimalFormat("#.#####")
	
	var requests: Int = 0
	var waitingTime: Long = 0
	
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
		case PassengerStat2(requests: Int, time: Long) => {
			this.requests += requests
			this.waitingTime += time
		}
		case PassengerStat3(requests: Int, time: Long, method: String) => {
		  if (!statRequests.contains(method))
		    statRequests.put(method, 0)
		  val i = statRequests.get(method).get + requests
		  statRequests.put(method, i)
		  if (!statWaitingTimes.contains(method))
		    statWaitingTimes.put(method, 0)
		  val j = statRequests.get(method).get + time
		  statWaitingTimes.put(method, j)  
		}
        case StatReport => {
                pstats.foreach { case (k, v) =>
                        var sb = new StringBuilder()
                        //println(Building.topFloor + ",B" + k + "," + v.addString(sb, ",").toString)
                }
                estats.foreach { case (k, v) =>
                        var sb = new StringBuilder()
                        //println(Building.topFloor + "," + k + "," + v.addString(sb, ",").toString)
                }
                //println(Building.topFloor + "," + requests + "," + waitingTime.toDouble / requests)
                statRequests.foreach { case (k, v) =>
                  		println(Building.topFloor + "," + k + "," + v + "," + formatter.format(statWaitingTimes.get(k).get.toDouble / v))
                }
                Building.topFloor = Building.topFloor + 10
        }
        case StatRestart => {
          pstats.clear
          estats.clear
          statRequests.clear
          statWaitingTimes.clear
        }
	}
}

object Building {

	val MAX_FLOORS: Int = 100
	var topFloor: Int = -1
	val groundFloor: Int = 1

	val system: ActorSystem = ActorSystem("building")
	val r: Random = new Random
	
	var firstFloorRequest: Int = _
	
	def start(floors: Int, delay: Int) = {
	
		topFloor = 10
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
		firstFloorRequest = r.nextInt(topFloor) + 1
		controller ! ElevatorRequest(firstFloorRequest, () => 1)
		
		val task = new TimerTask() {
			def run() = {
				if (topFloor > MAX_FLOORS) {
				  controller ! Stop
				} else {
					stats ! StatReport
					stats ! StatRestart
					controller ! ControllerRestart
				}
			}
		}
		val timer = new Timer()
		timer.schedule(task, 1 * 60 * 1000L, 1 * 60 * 1000L)
	}	
	
}

object Main {
	def main(args: Array[String]) {
		Building.start(Integer.valueOf(args(0)), Integer.valueOf(args(1)))
	}
}


