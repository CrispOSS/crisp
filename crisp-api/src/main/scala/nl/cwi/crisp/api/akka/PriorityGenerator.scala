package nl.cwi.crisp.api.akka

class PriorityGenerator extends akka.dispatch.PriorityGenerator {
  
  override def gen(message: Any): Int = {
    try {
    	var msg: PriorityMessage = message.asInstanceOf[PriorityMessage]
	    val p = msg.priority.getOrElse(0)
	    //println("priority msg [" + message + "] with p: " + p)
    	p
    } catch {
    	case e: Exception => println("Cannot cast " + message + " to a priority message")
    	0
    }
  } 
  
}
