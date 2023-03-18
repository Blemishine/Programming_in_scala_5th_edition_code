package chapter03

object List6_Step12_MapAndYield {

  def main(args: Array[String]): Unit = {
    for noun <- nouns_map do println(noun)
    for noun <- nouns_yield do println(noun)
    for length <- lengths_map do println(length)
    for length <- lengths_yield do println(length)

    println(startsW)
    println(startsW.map(word => word.toUpperCase()))
    println(
      for word <- startsW yield word.toUpperCase()
    )
  }

  val adjectives: List[String] = List("One", "Two", "Three", "Four")

  val nouns_map: List[String] = adjectives.map(adj => adj + " Fish")
  val nouns_yield: List[String] =
    for adj <- adjectives yield
      adj + " Fish"

  val lengths_map: List[Int] = nouns_yield.map(noun => noun.length)
  val lengths_yield: List[Int] =
    for noun <- nouns_yield yield
      noun.length

  val ques: Vector[String] = Vector("Who", "What", "When", "Where", "Why")

  val usingMap: Vector[String] = ques.map(q => q.toLowerCase + "?")
  val usingYield: Vector[String] =
    for que <- ques yield que.toLowerCase + "?"

  val startsW: Option[String] = ques.find(q => q.startsWith("W"))
}
