import java.util.Scanner;
import java.util.Stack;

class Solution {
  public String clearDigits(String s) {
    Stack<Character> stack = new Stack<>();
    for (Character c : s.toCharArray()) {
      if (Character.isDigit(c) && !stack.empty()) {
        stack.pop();
      } else {
        stack.push(c);
      }
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    return sb.reverse().toString();
  }
}

public class ClearDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution obj = new Solution();
    int tc = sc.nextInt();
    sc.nextLine();
    while (tc-- > 0) {
      String s = sc.nextLine();
      System.out.println(obj.clearDigits(s));
    }
    sc.close();
  }
}
