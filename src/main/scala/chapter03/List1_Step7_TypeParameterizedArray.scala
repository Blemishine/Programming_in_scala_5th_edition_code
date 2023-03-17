package chapter03

object List1_Step7_TypeParameterizedArray {
  val big = new java.math.BigInteger("12345") //Java type

  val greetStrings = new Array[String](3) // Scala native -> Auto Inference Support
  //val greetStrings: Array[String] = new Array[String](3) -> type declared

  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  greetStrings.update(0, "Hello")
  greetStrings.update(1, ", ")
  greetStrings.update(2, "world!\n")

  val numNames: Array[String] = Array("zero", "one", "two")
  val numNames2: Array[String] = Array.apply("zero", "one", "two")

  def main(args: Array[String]): Unit = {
    for i <- 0 to 2 do
      print(greetStrings(i))

    println()

    for i <- 0 to 2 do
      print(numNames(i) + " ")

    println()

    for i <- 0 to 2 do
      print(numNames2(i) + " ")
  }
}
