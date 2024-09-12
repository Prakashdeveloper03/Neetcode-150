import java.util.Scanner;

class Solution {
  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    for (int i = 2; i < n; i++) {
      cost[i] += Math.min(cost[i - 1], cost[i - 2]);
    }
    return Math.min(cost[n - 1], cost[n - 2]);
  }
}

public class MinClimb {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution obj = new Solution();
    int tc = sc.nextInt();
    while (tc-- > 0) {
      int n = sc.nextInt();
      int cost[] = new int[n];
      for (int i = 0; i < n; i++) {
        cost[i] = sc.nextInt();
      }
      System.out.println(obj.minCostClimbingStairs(cost));
    }
    sc.close();
  }
}
