import java.util.Scanner;

class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverseArray(int[] arr, int startIdx, int endIdx) {
        int j = endIdx;
        for (int i = startIdx; i < startIdx + ((endIdx + 1 - startIdx) / 2); i++) {
            swap(arr, i, j);
            j--;
        }
    }

    public void reverse(int[] arr, int l, int r) {
        while (l < r) {
            swap(arr, l++, r--);
        }
    }

    public void nextPermutation(int[] nums) {
        int i = 0;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        if (i == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (int j = nums.length - 1; j >= i + 1; j--) {
            if (nums[j] > nums[i]) {
                swap(nums, i, j);
                break;
            }
        }
        reverse(nums, i + 1, nums.length - 1);
    }
}

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            obj.nextPermutation(nums);
            for (int x : nums) {
                System.out.printf("%d ", x);
            }
            tc--;
        }
        sc.close();
    }
}