package chapter03

object List2_Step8_List {

  val oneTwoThree: List[Int] = List(1, 2, 3)
  val oneTwo: List[Int] = List(1, 2)
  val threeFour: List[Int] = List(3, 4)
  val oneTwoThreeFour: List[Int] = oneTwo ::: threeFour

  //val oneTwoThree: List[Int] = 1 :: 2 :: 3 :: Nil

  def main(args: Array[String]): Unit = {
    for i <- oneTwoThreeFour do
      println(i)
  }
}
