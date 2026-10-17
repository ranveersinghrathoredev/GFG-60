package gfg60;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int target = 10;

        boolean result = searchMatrix(matrix, target);
        System.out.println(result);

    }
        private static boolean searchMatrix ( int[][] matrix, int target){

            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

            int rows = matrix.length;
            int cols = matrix[0].length;

            int start = 0;
            int end = (rows * cols) - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                int row = mid / cols;
                int col = mid % cols;

                int midValue = matrix[row][col];

                if (midValue == target) {
                    return true;
                } else if (midValue < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
            return false;
        }
}