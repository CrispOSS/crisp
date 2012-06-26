package nl.cwi.crisp.examples.elevator.scala

import nl.cwi.crisp.api.akka.CrispActor
import nl.cwi.crisp.api.akka.PriorityMessage
import nl.cwi.crisp.api.akka.PriorityGenerator

class SchedulablePriorityGenerator extends PriorityGenerator {

	override def gen(message: Any): Int = {
		try {
			var msg: SchedulableMessage = message.asInstanceOf[SchedulableMessage]
			val p = msg.calculate.getOrElse(0)
			p
		} catch {
			case e: Exception => {
				e.printStackTrace()
				super.gen(message)
			}
		}
	}

}
