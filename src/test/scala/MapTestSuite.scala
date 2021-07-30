import org.junit.Assert.assertEquals
import org.junit._

class MapTestSuite {
  trait TestSets {
    val charMap1 = Map('k' -> 'K', 'g' -> 'G')
  }

  @Test def `Get Value in Map`(): Unit = {
    new TestSets {
      val result: Option[Char] = charMap1.get('k')
      assertEquals(result.getClass, Option('.').getClass)
    }
  }
}
