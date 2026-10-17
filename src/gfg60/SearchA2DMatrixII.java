package gfg60;

public class SearchA2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11}, {2, 5, 8, 12}, {3, 6, 9, 16}};
        int target = 2;

        boolean result = searchMatrixII(matrix, target);
        System.out.println(result);
    }
        private static boolean searchMatrixII(int[][] matrix, int target) {

            if( matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

            int rows = matrix.length;
            int cols = matrix[0].length;

            int r = 0;
            int c = cols - 1;

            while(r < rows && c >= 0) {
                if(matrix[r][c] == target) {
                    return true;
                }
                else if(matrix[r][c] > target) {
                    c--;
                } else {
                    r++;
                }
            }
            return false;
        }
}
