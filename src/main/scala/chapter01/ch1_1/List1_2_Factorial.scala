package chapter01.ch1_1

import java.math.BigInteger

object List1_2_Factorial {

  def main(args: Array[String]): Unit = {
    println(factorial_scala(30))
    println(factorial_java(BigInteger.valueOf(30)))
  }

  def factorial_scala(x: BigInt): BigInt = {
    if x == 0 then 1 else x * factorial_scala(x - 1)
  }

  def factorial_java(x: BigInteger): BigInteger = {
    if x == BigInteger.ZERO then BigInteger.ONE
    else x.multiply(factorial_java(x.subtract(BigInteger.ONE)))
  }
}
