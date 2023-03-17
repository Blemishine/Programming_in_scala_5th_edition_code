package chapter02;

object List2_Step2 {
  def main(args: Array[String]): Unit = {
    val msg = "Hello, world!"
    val msg2: java.lang.String = "Hello again, world!"
    val msg3: String = "Hello yet again, world!"

    //msg = "Goodbyte cruel world!" ->Won't work for reassigning to a val

    var greeting = "Hello, world!"
    greeting = "Leave me alone, world!"

    println(msg)
    println(msg2)
    println(msg3)
    println(greeting)
  }
}
