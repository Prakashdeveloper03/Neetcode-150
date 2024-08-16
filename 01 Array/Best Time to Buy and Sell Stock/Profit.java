import java.util.Scanner;

class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (prices == null || length == 0) {
            return 0;
        }
        int max_profit = 0, min_price = prices[0];
        for (int i = 1; i < length; i++) {
            if (prices[i] <= min_price) {
                min_price = prices[i];
                continue;
            }
            max_profit = Math.max(max_profit, prices[i] - min_price);
        }
        return max_profit;
    }
}

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            System.out.println(obj.maxProfit(nums));
            t--;
        }
        sc.close();
    }
}