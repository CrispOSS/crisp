package nl.cwi.crisp.examples.catalog

import scala.collection.mutable.ListBuffer

/**
 * @author Behrooz Nobakht
 */
class Catalog(val catalog: ListBuffer[Item]) {

  def this() {
    this(new ListBuffer[Item])
    for (i <- 1 to 100000) {
      catalog += new Item
    }
  }

  def search(name: String): ListBuffer[Item] = {
    val result: ListBuffer[Item] = new ListBuffer()
    catalog.foreach(p => {
      if (p.asInstanceOf[Item].name.equals(name))
        result += p.asInstanceOf[Item]
    })
    result
  }

  def generate(): ListBuffer[Item] = {
    ListBuffer[Item]()
  }

}

