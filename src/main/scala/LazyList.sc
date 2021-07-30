// LazyList는 head와 tail 모두 lazy하다.
// deprecated된 Streams에서는 tail만 lazy 했다.
def from(n: Int): LazyList[Int] = n #:: from(n+1)

println(from(1).take(2).mkString("|"))