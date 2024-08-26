import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] coins = new int[n];
            for (int i = 0; i < n; i++) {
                coins[i] = sc.nextInt();
            }
            int amount = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.coinChange(coins, amount));
            t--;
        }
        sc.close();
    }
}