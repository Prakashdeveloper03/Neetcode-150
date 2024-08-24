import java.util.Stack;
import java.util.Scanner;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char i : s.toCharArray()) {
            if (st.size() == 0 && (i == ')' || i == ']' || i == '}')) {
                return false;
            } else if (i == '(' || i == '[' || i == '{') {
                st.push(i);
            } else if (st.size() > 0 && st.peek() == '[' && i == ']') {
                st.pop();
            } else if (st.size() > 0 && st.peek() == '(' && i == ')') {
                st.pop();
            } else if (st.size() > 0 && st.peek() == '{' && i == '}') {
                st.pop();
            } else {
                return false;
            }
        }
        if (st.size() == 0)
            return true;
        return false;
    }
}

public class isValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        Solution obj = new Solution();

        while (tc > 0) {
            String s = sc.nextLine();
            System.out.println(obj.isValid(s));
            tc--;
        }
        sc.close();
    }
}