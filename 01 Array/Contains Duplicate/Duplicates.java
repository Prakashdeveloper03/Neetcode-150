import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for (int x : nums) {
            if (counter.getOrDefault(x, 0) >= 1) {
                return true;
            }
            counter.put(x, counter.getOrDefault(x, 0) + 1);
        }
        return false;
    }
}

public class Duplicates {
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
            System.out.println(obj.containsDuplicate(nums));
            t--;
        }
        sc.close();
    }
}