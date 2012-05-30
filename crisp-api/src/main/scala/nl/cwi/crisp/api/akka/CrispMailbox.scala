package nl.cwi.crisp.api.akka

import akka.actor.ActorContext
import akka.actor.ActorSystem
import akka.dispatch.Envelope
import akka.dispatch.MailboxType
import akka.dispatch.MessageQueue
import akka.dispatch.QueueBasedMessageQueue
import akka.dispatch.UnboundedMessageQueueSemantics

import java.util.Queue
import java.util.concurrent.PriorityBlockingQueue

import com.typesafe.config.Config

class CrispMailbox() extends MailboxType {
  
  private val comparator = new PriorityGenerator()
  
  /**
   * Standard Akka constructor for MailboxType
   */
  def this(settings: ActorSystem.Settings, config: Config) = this()
  
  val mailboxSize: Int = 1024 * 32;
  
  final override def create(owner: Option[ActorContext]): MessageQueue =
    new PriorityBlockingQueue[Envelope](mailboxSize, comparator) with QueueBasedMessageQueue with UnboundedMessageQueueSemantics {
      final def queue: Queue[Envelope] = this
    }
  
}