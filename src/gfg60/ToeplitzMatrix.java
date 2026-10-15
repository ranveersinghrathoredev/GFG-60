package gfg60;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        System.out.println(isToeplitzMatrix(matrix));
    }

        private static boolean isToeplitzMatrix(int[][] matrix) {

            for(int r = 1; r < matrix.length; r++) {
                for(int c = 1; c < matrix[r].length; c++) {
                    if(matrix[r][c] != matrix[r - 1][c - 1]) {
                        return false;
                    }
                }
            }
            return true;
        }

}
