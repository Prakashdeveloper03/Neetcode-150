import scala.io.StdIn

object Solution {
  def isPalindrome(x: Int): Boolean = {
    var reversedNum: Int = 0
    var temp: Int = x
    while (temp > 0) {
      reversedNum = reversedNum * 10 + temp % 10;
      temp = temp / 10;
    }
    return x == reversedNum;
  }
}

object Palindrome extends App {
  val tc = StdIn.readInt()
  for (_ <- 1 to tc) {
    val n = StdIn.readInt()
    println(Solution.isPalindrome(n))
  }
}
