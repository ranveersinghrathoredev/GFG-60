package gfg60;

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        int[][] result = generateMatrix(n);
        for(int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
        private static int[][] generateMatrix(int n) {

            int[][] matrix = new int[n][n];

            int top = 0, bottom = n - 1;
            int left = 0, right = n - 1;
            int val = 1;

            while(val <= n * n) {

                for(int i = left; i <= right; i++) {
                    matrix[top][i] = val++;
                }
                top++;

                for(int i = top; i <= bottom; i++) {
                    matrix[i][right] = val++;
                }
                right--;

                for(int i = right; i >= left; i--) {
                    matrix[bottom][i] = val++;
                }
                bottom--;

                for(int i = bottom; i >= top; i--) {
                    matrix[i][left] = val++;
                }
                left++;

            }
            return matrix;
        }
}
