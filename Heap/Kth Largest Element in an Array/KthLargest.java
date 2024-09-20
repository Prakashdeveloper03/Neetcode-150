import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (int x : nums) {
      heap.add(x);
      if (heap.size() > k) {
        heap.remove();
      }
    }
    return heap.peek();
  }
}

public class KthLargest {
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
      int k = sc.nextInt();
      System.out.println(obj.findKthLargest(nums, k));
    }
    sc.close();
  }
}
