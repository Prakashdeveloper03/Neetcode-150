import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int x : nums) {
            if(mp.getOrDefault(x, 0) >= 1) {
                return true;
            } else {
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
        }
        return false;
    }
}

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        int tc = sc.nextInt();
        while(tc > 0) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(obj.hasDuplicate(nums));
            tc--;
        }
        sc.close();
    }
}