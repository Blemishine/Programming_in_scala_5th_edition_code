package chapter03

object List5_Step11_FunctionalProgramming {

  def main(args: Array[String]): Unit = {
    val list: List[String] = List("zero", "one", "two")
    val res = formatArgs(list)
    printArgs(list)
    printlnArgs_Functional1(list)
    printlnArgs_Functional2(list)
    assert(res == "zero\none\ntwo")
  }

  def printArgs(args: List[String]): Unit = {
    var i = 0
    while i < args.length do
      println(args(i))
      i += 1
  }

  def printlnArgs_Functional1(args: List[String]): Unit =
    for arg <- args do
      println(arg)

  def printlnArgs_Functional2(args: List[String]): Unit =
    args.foreach(println)

  def formatArgs(args: List[String]): String = args.mkString("\n")

}
