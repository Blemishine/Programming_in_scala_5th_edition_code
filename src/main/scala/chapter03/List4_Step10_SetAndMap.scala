package chapter03

import scala.collection.immutable.HashSet
import scala.collection.mutable


object List4_Step10_SetAndMap {

  var jetSet: Set[String] = Set("Boeing", "AirBus")
  jetSet += "Lear"
  //jetSet = jetSet + "Lear"
  val query: Boolean = jetSet.contains("Cessna")

  val movieSet: mutable.Set[String] = mutable.Set("Spotlight", "Moonlight")
  movieSet += "Parasite"

  val hashSet: HashSet[String] = HashSet("Tomatos", "Chiles")
  val ingredients: HashSet[String] = hashSet + "Coriander"

  val treasureMap = mutable.Map.empty[Int, String]
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on the ground.")
  treasureMap += (3 -> "Dig.")
  val step2: String = treasureMap(2)

  val romanNumeral: Map[Int, String] = Map(
    1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
  )

  val four: String = romanNumeral(4)


  def main(args: Array[String]): Unit = {
    println(query)
    println(step2)
    println(four)
  }
}
