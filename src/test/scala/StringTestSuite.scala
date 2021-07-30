import org.junit._
import org.junit.Assert.assertEquals

class StringTestSuite {
  trait TestSets {
    val str1 = "abcdef"
  }

  @Test def `String To List`(): Unit = {
    new TestSets {
      assertEquals(str1.to(List), List('a', 'b', 'c', 'd', 'e', 'f'))
    }
  }
}
