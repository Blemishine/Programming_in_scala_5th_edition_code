package chapter01.ch1_2

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.concurrent.Eventually
import org.scalatest.matchers.should.Matchers

class List1_Functional extends AnyFunSuite with Eventually with Matchers {
  test ("Iterator Test") {
    val xs = 1 to 3
    val it = xs.iterator
    eventually(it.next() should be (3))
  }
}
