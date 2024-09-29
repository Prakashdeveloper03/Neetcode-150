import java.util.Scanner;

class Solution {
  public boolean isPalindrome(String s) {
    s = s.trim().toLowerCase();
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
      char ch1 = s.charAt(i);
      char ch2 = s.charAt(j);
      if (ch1 >= 97 && ch1 <= 122 || ch1 >= 48 && ch1 <= 57) {
        if (ch2 >= 97 && ch2 <= 122 || ch2 >= 48 && ch2 <= 57) {
          if (ch1 != ch2) return false;
          else {
            i++;
            j--;
          }
        } else {
          j--;
        }
      } else {
        i++;
      }
    }
    return true;
  }
}

public class ValidPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution obj = new Solution();
    int tc = sc.nextInt();
    sc.nextLine();
    while (tc-- > 0) {
      String s = sc.nextLine();
      System.out.println(obj.isPalindrome(s));
    }
    sc.close();
  }
}
