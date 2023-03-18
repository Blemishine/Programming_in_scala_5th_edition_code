package chapter04.ch4_1

import scala.collection.mutable

class List3_SingletonObject {

  class ChecksumAccumulator {
    private var sum = 0

    def add(b: Byte) = sum += b

    def checksum() = ~(sum & 0xFF) + 1
  }

  def newChecksumAccumulator: ChecksumAccumulator = {
    val instance = new ChecksumAccumulator
    instance
  }

}

object List3_SingletonObject:

  def main(args: Array[String]): Unit = {
    println(List3_SingletonObject.calculate("Every value is a object"))
  }


  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if cache.contains(s) then
      cache(s)
    else
      val outer = new List3_SingletonObject
      val acc = outer.newChecksumAccumulator // access the inner class
        for c <- s do
          acc.add((c >> 8).toByte)
          acc.add(c.toByte)
        val cs = acc.checksum()
        cache += (s -> cs)
        cs



