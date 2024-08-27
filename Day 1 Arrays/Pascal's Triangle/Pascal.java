import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0)
            return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }

        List<List<Integer>> prevRows = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }

        for (int i = 1; i < numRows - 1; i++) {
            newRow.set(i, prevRows.get(numRows - 2).get(i - 1) + prevRows.get(numRows - 2).get(i));
        }

        prevRows.add(newRow);
        return prevRows;
    }
}

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {
            int n = sc.nextInt();
            int width = 4 * n - 3;
            Solution obj = new Solution();
            List<List<Integer>> result = obj.generate(n);
            for (List<Integer> rows : result) {
                int spaces = ((width - (rows.size() * 4)) / 2) > 0 ? (width - (rows.size() * 4)) / 2 : 2;
                System.out.print(" ".repeat(spaces));
                for (Integer cols : rows) {
                    System.out.printf("%4d", cols);
                }
                System.out.println();
            }
            tc--;
        }
        sc.close();
    }
}