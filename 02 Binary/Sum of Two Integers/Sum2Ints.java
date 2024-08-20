import java.util.Scanner;

class Solution {
    public int getSum(int a, int b) {
        int temp = a;
        while ((a & b) != 0) {
            temp = a;
            a = a ^ b;
            b = (temp & b) << 1;
        }
        return a | b;
    }
}

public class Sum2Ints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.getSum(a, b));
            t--;
        }
        sc.close();
    }
}