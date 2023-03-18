package chapter04.ch4_1

object List2_SemicolonInference {
  def main(args: Array[String]): Unit = {
    val s = "hello" ; println(s)

    val x = 1

    if x < 2 then "too small" else "ok"
  }
}
