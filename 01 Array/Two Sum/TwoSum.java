import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(num, i);
        }
        return new int[0];
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            Solution obj = new Solution();
            int[] result = obj.twoSum(nums, target);
            for (int x : result) {
                System.out.printf("%d ", x);
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}