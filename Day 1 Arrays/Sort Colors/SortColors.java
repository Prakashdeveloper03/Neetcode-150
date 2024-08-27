import java.util.Scanner;

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] countArray = new int[3];
        for (int i = 0; i < n; i++) {
            int element = nums[i];
            countArray[element]++;
        }
        int j = 0;
        for (int element = 0; element < 3; element++) {
            while (countArray[element] > 0) {
                nums[j] = element;
                j++;
                countArray[element]--;
            }
        }
    }
}

public class SortColors {
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
            obj.sortColors(nums);
            for (int x : nums) {
                System.out.printf("%d ", x);
            }
            System.out.println();
            tc--;
        }
        sc.close();
    }
}