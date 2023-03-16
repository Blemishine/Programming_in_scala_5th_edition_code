package chapter01.ch1_1

import org.scalatest.funsuite.AnyFunSuite

class List1_3_NewType extends AnyFunSuite {
  test ("An Empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test ("Invoking head on an empty Set should fail") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
