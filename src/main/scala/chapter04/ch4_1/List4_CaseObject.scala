package chapter04.ch4_1

case class Person(name: String, age: Int):
  def appendToName(suffix: String): Person = {
    Person(s"$name$suffix", age)
  }

object Person:
  def apply(name: String, age: Int): Person =
    val capitalizedName =
      if !name.isEmpty then
        val firstChar = name.charAt(0).toUpper
        val restOfName = name.substring(1)
        s"$firstChar$restOfName"
      else throw new IllegalArgumentException("Empty Name")
    new Person(capitalizedName, age)

object List4_CaseObject {

  def main(args: Array[String]): Unit = {
    println(p.age)
    println(p.name)
    println(p.hashCode() == Person("Sally", 39).hashCode())
    println(q.hashCode() == p.hashCode())
  }

  val p = Person("Sally", 39)
  val q = Person("sally", 39)
}
