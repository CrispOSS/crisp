package nl.cwi.crisp.api.akka

class PriorityGenerator extends akka.dispatch.PriorityGenerator {
  
  override def gen(message: Any): Int = {
    var msg: PriorityMessage = message.asInstanceOf[PriorityMessage]
    val p = msg.priority.getOrElse(0)
    p
  } 
  
}