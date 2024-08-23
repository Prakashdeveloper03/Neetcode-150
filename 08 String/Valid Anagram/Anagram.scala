import scala.collection.mutable.HashMap
import scala.io.StdIn

object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    if (s.length != t.length) {
      false
    } else {
      val counter1 = new HashMap[Char, Int]()
      val counter2 = new HashMap[Char, Int]()
      s.foreach(c => counter1.put(c, counter1.getOrElse(c, 0) + 1))
      t.foreach(c => counter2.put(c, counter2.getOrElse(c, 0) + 1))
      counter1 == counter2
    }
  }
}

object Anagram extends App {
  val tc = StdIn.readInt()
  for (_ <- 1 to tc) {
    val s = StdIn.readLine()
    val t = StdIn.readLine()
    println(Solution.isAnagram(s, t))
  }
}
