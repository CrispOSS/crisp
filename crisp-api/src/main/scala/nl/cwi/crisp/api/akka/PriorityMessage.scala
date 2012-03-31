package nl.cwi.crisp.api.akka

abstract case class CrispMessage {
  
  final val createdTime = System.currentTimeMillis()
  
}

case class PriorityMessage(var priority: Option[Int] = None) extends CrispMessage
