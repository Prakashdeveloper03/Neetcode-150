import java.util.Scanner;

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int left = 0, right = n - 1, mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] < nums[right] && nums[mid] < nums[left]) {
                right = mid;
            } else if (nums[mid] > nums[left] && nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] == nums[left] && nums[left] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[left] && nums[mid] < nums[right]) {
                left = mid + 1;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}

public class RotatedMinElement {
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
            System.out.println(obj.findMin(nums));
            t--;
        }
        sc.close();
    }
}