package chapter04.ch4_5

import chapter04.ch4_5.ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]): Unit = {
    for arg <- args do 
      println(arg + ": " + calculate(arg))
  }
}
