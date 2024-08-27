import java.util.Scanner;

class Solution {
    public void setZeroes(int[][] matrix) {
        int col = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0)
                        matrix[0][j] = 0;
                    else
                        col = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (matrix[0][0] == 0) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        if (col == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

public class SetZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            Solution obj = new Solution();
            obj.setZeroes(matrix);

            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            tc--;
        }
        sc.close();
    }
}