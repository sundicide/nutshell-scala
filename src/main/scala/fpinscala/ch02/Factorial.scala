package fpinscala.ch02

import scala.annotation.tailrec

object Factorial {

  def factorial(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n - 1, acc * n)
    }
    go(n, 1)
  }

  def main(args: Array[String]): Unit = {
  }
}
