import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit._

import scala.collection.immutable.HashMap

class MapTestSuite {
  trait TestSets {
    val charMap1 = Map('k' -> 'K', 'g' -> 'G')
    val intHashMap1 = HashMap("C" -> 4, "D" -> 5)
  }

  @Test def `Get Value in Map`(): Unit = {
    new TestSets {
      val result: Option[Char] = charMap1.get('k')
      assertEquals(result.getClass, Option('.').getClass)
    }
  }

  @Test def `tuple type Test`(): Unit = {
    assertTrue(Utils.manOf((1, 2)) == Utils.manOf(1 -> 2))
  }

  @Test def `map Equivalent Test`(): Unit = {
    val map1 = Map('a' -> 2, 1 -> 3)
    val map2 = Map('a' -> 2, 1 -> 3)

    assertTrue(map1 == map2)


    val map3 = Map('b' -> 2, 1 -> 3)
    assertFalse(map1 == map3)
  }

  @Test def `map Generation`(): Unit = {
    val mapFromList = List((1, 2), (3, 4)).toMap
    val mapFromConstructor = Map((1 ,2), (3, 4))

    assertTrue(mapFromList == mapFromConstructor)
  }

  @Test def `hashMap getOrElse Test`(): Unit = {
    new TestSets {
      val notFoundedKey = intHashMap1.getOrElse("A", 1)
      assertEquals(notFoundedKey, 1)

      val foundedKey = intHashMap1.getOrElse("C", 1)
      assertEquals(foundedKey, 4)
    }
  }

}
