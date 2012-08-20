package nl.cwi.crisp.examples.catalog

import java.util.Random

class Item {
  val r: Random = new Random
  val id = "id-" + r.nextInt(1000)
  val name = "item-" + r.nextInt(1000)
  
  override def toString = name
}