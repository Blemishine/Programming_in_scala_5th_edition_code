package chapter04.ch4_1

object List1_ClassFieldsMethods {
  def main(args: Array[String]): Unit = {
    new ChecksumAccumulator
    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator
    acc.sum = 3
    //acc = new ChecksumAccumulator -> reassigned to a val
    //acc.sum_private = 3 -> cannot access to private
    acc.add(5)
    println(acc.checksum())
  }
}

class ChecksumAccumulator:
  println("A class declared")
  var sum = 0
  private var sum_private = 0

  def add(b: Byte): Unit = sum_private += b
  def checksum(): Int = ~(sum_private & 0xFF) + 1