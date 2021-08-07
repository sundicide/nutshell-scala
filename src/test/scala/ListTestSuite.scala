import org.junit.Assert.assertEquals
import org.junit._

class ListTestSuite {
  trait TestSets {
    val numList = List(1,2,3,4,5,6)
    val strList = List("a", "b", "c", "d")
    val mapList = List(("a", 1), ("b", 2), ("c", 3), ("d", 4))
  }

  @Test def `Fold Test`(): Unit = {
    new TestSets {
      val result = numList.reduce(_ + _)
      assertEquals(result, 21)

      // aggregate is deprecated
      val mapResult: Int = mapList.foldLeft(0)((acc, curr) => curr._2 + acc)
      assertEquals(mapResult, 10)
    }
  }

  /**
   * partition에 대한 설명
   * A pair of,
   *   first, all elements that satisfy predicate p and,
   *   second, all elements that do not.
   * Interesting because it splits a collection in two.
   * The default implementation provided here needs to traverse the collection twice.
   *
   * Strict collections have an overridden version of partition in StrictOptimizedIterableOps, which requires only a single traversal.
   */
  @Test def `Partition Test`(): Unit = {
    new TestSets {
      val (left, right) = mapList.partition(d => d._2 < 3)
      assertEquals(left, List(("a", 1), ("b", 2)))
      assertEquals(right, List(("c", 3), ("d", 4)))
    }
  }
}
