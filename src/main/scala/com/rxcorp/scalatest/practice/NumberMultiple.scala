package com.rxcorp.scalatest.practice

object NumberMultiple extends App {

  def fizzBuzz(inputNumber: Int): String =    {
    (inputNumber%3,inputNumber%5) match {
      case (0, 0) => "fizzbuzz"
      case (0, _) => "fizz"
      case(_,0) => "buzz"
      case _ => inputNumber.toString
    }
  }

  val result:String = fizzBuzz(5)

  println(s"Output string is $result")
}
