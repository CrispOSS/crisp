package nl.cwi.crisp.examples.p2p.scala

import java.util.Collection
import java.util.Random

import scala.collection.JavaConversions.seqAsJavaList

import nl.cwi.crisp.examples.p2p.Storage

class RandomStorage extends Storage {

  val r = new Random
  val myList: List[String] = for (i <- List.range(0, 1000)) yield (14 + r.nextInt(100) + "")

  def list(): Collection[String] = {
    myList.toList
  }

  def getLength(fileName: String): Int =
    r.nextInt(1024)

  def persist(fileName: String, file: Object) = {
  }

  def load(fileName: String): Object =
    new Object

}
