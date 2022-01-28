package fpinscala.ch02

object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def formatResult(name: String, n: Int, f: Int => Int): String = {
    val msg = "The absolute value of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}
