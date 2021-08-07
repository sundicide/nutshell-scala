import org.junit._
import org.junit.Assert.{assertEquals, assertTrue}

class StringTestSuite {
  trait TestSets {
    val str1 = "abcdef"
  }

  @Test def `String To List`(): Unit = {
    new TestSets {
      assertEquals(str1.to(List), List('a', 'b', 'c', 'd', 'e', 'f'))
    }
  }

  @Test def `Split Test`(): Unit = {
    val data = "a,,"
    val defaultSplit = data.split(",")
    assertTrue(defaultSplit.length == 1)

    val limitSplit = data.split(",", -1)
    assertTrue(limitSplit.length == 3)
  }

  @Test def `Comparison Test`(): Unit = {
    val a = "00700"
    assertTrue(a == "00700")
  }
}
