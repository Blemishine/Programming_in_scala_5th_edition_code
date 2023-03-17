package chapter02;

object List3_Step3 {

  def main(args: Array[String]): Unit = {
    val bigger = max(3, 5)
    println(bigger)
  }

  def max(x: Int, y: Int): Int = {
    if x > y then x else y
  }

}
