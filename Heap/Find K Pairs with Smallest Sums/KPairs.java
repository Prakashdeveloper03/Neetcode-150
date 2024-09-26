import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {
  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(x -> x[0]));
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums1.length; i++) {
      heap.offer(new int[] {nums1[i] + nums2[0], i, 0});
    }
    while (k-- > 0 && !heap.isEmpty()) {
      int[] top = heap.poll();
      int pos1 = top[1];
      int pos2 = top[2];
      result.add(Arrays.asList(nums1[pos1], nums2[pos2]));
      if (pos2 + 1 < nums2.length) {
        heap.offer(new int[] {nums1[pos1] + nums2[pos2 + 1], pos1, pos2 + 1});
      }
    }
    return result;
  }
}

public class KPairs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution obj = new Solution();
    int tc = sc.nextInt();
    while (tc-- > 0) {
      int n1 = sc.nextInt();
      int nums1[] = new int[n1];
      for (int i = 0; i < n1; i++) {
        nums1[i] = sc.nextInt();
      }
      int n2 = sc.nextInt();
      int nums2[] = new int[n1];
      for (int i = 0; i < n2; i++) {
        nums2[i] = sc.nextInt();
      }
      int k = sc.nextInt();
      System.out.println(obj.kSmallestPairs(nums1, nums2, k));
    }
    sc.close();
  }
}
