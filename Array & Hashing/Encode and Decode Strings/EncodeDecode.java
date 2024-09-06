import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Solution {
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}


public class EncodeDecode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        int tc = sc.nextInt();
        while (tc > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            List<String> strs = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                strs.add(sc.nextLine());
            }
            String encodedString = obj.encode(strs);
            List<String> result = obj.decode(encodedString);
            for (String str : result) {
                System.out.print(str + " ");
            }
            System.out.println();
            tc--;
        }
        sc.close();
    }
}