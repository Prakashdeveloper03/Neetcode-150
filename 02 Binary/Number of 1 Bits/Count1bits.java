import java.util.Scanner;

class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}

public class Count1bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.hammingWeight(n));
            t--;
        }
        sc.close();
    }
}