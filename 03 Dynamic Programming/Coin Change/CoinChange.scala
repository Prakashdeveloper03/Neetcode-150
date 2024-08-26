import scala.io.StdIn

object Solution {
  def coinChange(coins: Array[Int], amount: Int): Int = {
    val dp = Array.fill(amount + 1)(amount + 1)
    dp(0) = 0
    for (coin <- coins) {
      for (i <- coin to amount) {
        dp(i) = math.min(dp(i), dp(i - coin) + 1)
      }
    }
    if (dp(amount) > amount) -1 else dp(amount)
  }
}

object CoinChange {
  def main(args: Array[String]): Unit = {
    val t = StdIn.readInt()
    for (_ <- 1 to t) {
      val n = StdIn.readInt()
      val coins = new Array[Int](n)
      for (i <- 0 until n) {
        coins(i) = StdIn.readInt()
      }
      val amount = StdIn.readInt()
      println(Solution.coinChange(coins, amount))
    }
  }
}
