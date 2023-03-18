package chapter04.ch4_5

class ChecksumAccumulator:
  private var sum = 0
  def add(b: Byte) = sum += b
  def checksum() = ~(sum & 0xFF) + 1

// In file ChecksumAccumulator.scala

import scala.collection.mutable

object ChecksumAccumulator:

  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if cache.contains(s) then
      cache(s)
    else
      val acc = new ChecksumAccumulator
      for c <- s do
        acc.add((c >> 8).toByte)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs