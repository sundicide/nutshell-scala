package fpinscala.ch02

import scala.annotation.tailrec

object Exercises {
  /* 2-1. fib 구현 */
  def fib(n: Int): Int = {
    @tailrec
    def go(n: Int, first: Int, second: Int): Int = {
      if (n == 1) first + second
      else go(n - 1, second, first + second)
    }
    if (n < 1) 0
    else if (n == 2) 1
    else go(n - 2, 0, 1)
  }

  /* 2-2 */
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    @tailrec
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n + 1))) loop(n + 1)
      else false
    }
    loop(0)
  }

  /* 2-3  curring */
  def curry[A,B,C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  /* 2-5 */
  def compose[A,B,C] (f: B => C, g: A => B): A => C =
    (a: A) => f(g(a))

  def main(args: Array[String]): Unit = {
    println(fib(3), fib(4), fib(5))

    val testDescArr = Array(2,5,6)
    println(isSorted(testDescArr, (a: Int, b: Int) => a - b < 0))
    val testAscArr = Array(8,5,1)
    println(isSorted(testAscArr, (a: Int, b: Int) => a - b > 0))
    val testFalseArr = Array(8,5,9)
    println(isSorted(testFalseArr, (a: Int, b: Int) => a - b > 0))
  }

}
