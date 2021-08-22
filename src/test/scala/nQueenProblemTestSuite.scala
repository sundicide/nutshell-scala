import nQueenProblem.queens
import org.junit.Assert.assertTrue
import org.junit.Test

class nQueenProblemTestSuite {

  def getSolution(n: Int): Int = {
    queens(n).size
  }

  @Test def nQueen(): Unit = {
    assertTrue(getSolution(1) == 1)
    assertTrue(getSolution(2) == 0)
    assertTrue(getSolution(3) == 0)
    assertTrue(getSolution(4) == 2)
    assertTrue(getSolution(5) == 10)
    assertTrue(getSolution(6) == 4)
  }
}
