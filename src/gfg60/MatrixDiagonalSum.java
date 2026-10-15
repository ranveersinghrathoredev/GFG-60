package gfg60;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{2, 4, 7}, {5, 8, 9}, {1, 7, 3}};
        System.out.println("Result: "+ diagonalSum(matrix));

    }

        private static int diagonalSum(int[][] mat) {
            int n = mat.length;
            int sum = 0;

            for(int i = 0; i < n; i++) {
                sum += mat[i][i];
                sum += mat[i][n - 1 - i];
            }

            if(n % 2 != 0) sum -= mat[n/2][n/2];
            return sum;
        }
}
