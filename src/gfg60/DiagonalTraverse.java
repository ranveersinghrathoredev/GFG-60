package gfg60;

import java.util.Arrays;

public class DiagonalTraverse {
    public static void main(String[] args) {
//        int[][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] mat1 = {{1, 2},{3, 4}};
        System.out.println(Arrays.toString(findDiagonalOrder(mat1)));
    }
    private static int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];
        int m = mat.length;
        int n = mat[0].length;

        int row = 0;
        int col = 0;
        int[] result = new int[m * n];
        boolean up = true;

        for(int i = 0; i < result.length; i++) {
            result[i] = mat[row][col];

            if(up) {
                if(col == n - 1) {
                    row++;
                    up = false;
                } else if(row == 0){
                    col++;
                    up = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if(row == m - 1) {
                    col++;
                    up = true;
                } else if(col == 0) {
                    row++;
                    up = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}
