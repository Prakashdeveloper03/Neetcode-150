import java.util.Arrays;
import java.util.Scanner;

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] nums = new int[nums1.length + nums2.length];
    System.arraycopy(nums1, 0, nums, 0, nums1.length);
    System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
    Arrays.sort(nums);
    return (nums[nums.length >> 1] + nums[(nums.length - 1) >> 1]) / 2.0;
  }
}

public class Median {
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
      int nums2[] = new int[n2];
      for (int i = 0; i < n2; i++) {
        nums2[i] = sc.nextInt();
      }
      System.out.println(obj.findMedianSortedArrays(nums1, nums2));
    }
    sc.close();
  }
}
