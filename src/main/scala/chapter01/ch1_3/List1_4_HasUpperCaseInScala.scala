package chapter01.ch1_3

object List1_4_HasUpperCaseInScala {
  def main(args: Array[String]): Unit = {
    val name: String = "Blemishine"
    val nameHasUpperCase:Boolean = name.exists(_.isUpper)
    assert (nameHasUpperCase)
  }
}
