import scala.annotation.tailrec

object CharDuplicationCheck {

  @tailrec
  def iter(accu: Set[Char], param: String): Set[Char] = {
    if (param.isEmpty) accu
    else {
      iter(accu + (param.head), param.tail)
    }
  }
  def main(args: Array[String]): Unit = {
    val str = "abcdefa"
    val s = iter(Set(), str)
    if (str.length != s.size) println("something is duplicated")
    else println("ok! none duplicated")
  }
}
