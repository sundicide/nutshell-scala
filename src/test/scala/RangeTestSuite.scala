import org.junit.Assert.{assertEquals, assertTrue}
import org.junit._

class RangeTestSuite {
  trait TestSets {
    val to1: Seq[Int] = (0 to 3)
    val until1: Seq[Int] = (0 until 3)
  }

  @Test def `to vs until`(): Unit = {
    new TestSets {
      assertTrue(to1.last == 3)
      assertTrue(until1.last == 2)
    }
  }
}
