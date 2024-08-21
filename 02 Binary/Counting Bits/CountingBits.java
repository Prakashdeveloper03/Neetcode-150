import java.util.Scanner;

class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}

public class CountingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int num = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.countBits(num));
            t--;
        }
        sc.close();
    }
}