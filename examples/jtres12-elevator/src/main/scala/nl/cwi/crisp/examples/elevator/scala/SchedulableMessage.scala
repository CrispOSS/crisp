package nl.cwi.crisp.examples.elevator.scala

import nl.cwi.crisp.api.akka.CrispActor
import nl.cwi.crisp.api.akka.PriorityMessage

class SchedulableMessage(p: Option[Int] = None, scheduler: () => Int) extends PriorityMessage(p) {

	def calculate: Option[Int] = {
		try {
			val s = scheduler.apply()
			Some(s)
		} catch {
			case e: Exception => {}
			p
		}
	}

}

