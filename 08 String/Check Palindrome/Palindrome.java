import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        int reversedNum = 0, temp = x;
        while (temp > 0) {
            reversedNum = reversedNum * 10 + temp % 10;
            temp = temp / 10;
        }
        return x == reversedNum;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.isPalindrome(x));
            t--;
        }
        sc.close();
    }
}