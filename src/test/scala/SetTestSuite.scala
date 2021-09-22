import org.junit.Assert.{assertEquals, assertTrue}
import org.junit._

class SetTestSuite {
  trait TestSets {
    val str1 = "abcdef"
  }

  @Test def `Set Test`(): Unit = {
    new TestSets {
      val s: Set[Char] = Set()
      println(s)
      val d = s + 'a'
      println(d)
    }
  }

}
