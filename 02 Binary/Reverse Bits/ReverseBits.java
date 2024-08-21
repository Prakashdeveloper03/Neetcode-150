import java.util.Scanner;

class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31)
                result <<= 1;
        }
        return result;
    }
}

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int num = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.reverseBits(num));
            t--;
        }
        sc.close();
    }
}