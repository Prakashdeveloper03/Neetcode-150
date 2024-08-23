import java.util.HashMap;
import java.util.Scanner;

class Solution {
    boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> counter1 = new HashMap<>();
        HashMap<Character, Integer> counter2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter1.put(c, counter1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            counter2.put(c, counter2.getOrDefault(c, 0) + 1);
        }
        return counter1.equals(counter2);
    }
}

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        Solution obj = new Solution();

        while (tc > 0) {
            String s = sc.nextLine().replaceAll("\\s", "");
            String t = sc.nextLine().replaceAll("\\s", "");
            System.out.println(obj.isAnagram(s, t));
            tc--;
        }
        sc.close();
    }
}
