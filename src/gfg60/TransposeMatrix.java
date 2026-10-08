package gfg60;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
//        int[][] matrixOne = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixTwo = {{1, 2, 3}, {4, 5, 6}};


//        int[][] result =  transposeThreeByThreeMatrix(matrixOne);
//        for(int i = 0; i < result.length; i++) {
//            System.out.println(Arrays.toString(result[i]));
//        }


        int[][] result =  transposeMatrixTwoByThree(matrixTwo);
        for(int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

//    private static int[][] transposeThreeByThreeMatrix(int[][] matrixOne) {
//        int row = matrixOne.length;
//        int col = matrixOne[0].length;
//
//        for(int r = 0; r < row; r++) {
//            for(int  c = r + 1; c < col; c++) {
//                int temp = matrixOne[r][c];
//                matrixOne[r][c] = matrixOne[c][r];
//                matrixOne[c][r] = temp;
//            }
//        }
//        return matrixOne;
//    }
//}



    // this one is universal, works for both  2 * 3  &  3 * 3

    private static int[][] transposeMatrixTwoByThree(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows]; // Now 3 x 2
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[c][r] = matrix[r][c];
            }
        }
        return result;
    }

}