import java.util.Scanner;

class Solution {
  public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1, mid;
    while (left <= right) {
      mid = (left + right) / 2;
      if (nums[mid] == target) return mid;
      else if (nums[mid] >= target) right = mid - 1;
      else left = mid + 1;
    }
    return -1;
  }
}

public class Search {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution obj = new Solution();
    int tc = sc.nextInt();
    while (tc-- > 0) {
      int n = sc.nextInt();
      int nums[] = new int[n];
      for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
      }
      int target = sc.nextInt();
      System.out.println(obj.search(nums, target));
    }
    sc.close();
  }
}
