import org.junit.Assert.assertEquals
import org.junit._

class ArrayTestSuite {
  trait TestSets {
    val numArray = Array(1,2,3,4,5,6)
    val arrayInArray = Array(Array("a", "b"), Array("c", "d"))
  }

  @Test def `print Test`(): Unit = {
    new TestSets {
      arrayInArray foreach (arr => println(arr.mkString(", ")))
    }
  }
}
