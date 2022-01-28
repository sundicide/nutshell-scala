import org.junit._
import org.junit.Assert.{assertEquals, assertTrue}

class RegexTestSuite {
  trait TestSets {
    val testString = "abcd[123"
  }

  @Test def `Regex Test`(): Unit = {
    new TestSets {
      val regex = "\\[" // split by '['
      val result: List[String] = List.from(testString.split(regex))
      assertEquals(result, List("abcd", "123"))
    }
  }

}
