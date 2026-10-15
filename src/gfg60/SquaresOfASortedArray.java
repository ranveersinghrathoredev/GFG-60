package gfg60;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, 2, 3, 6};
        System.out.println("Sorted Squares of Array Elements: "+ Arrays.toString(sortedSquares(nums)));
    }
        private static int[] sortedSquares(int[] nums) {

            int n = nums.length;
            int[] result = new int[n];

            int left = 0;
            int right = nums.length - 1;
            int index = nums.length - 1;

            while(left <= right) {
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];

                if(leftSquare > rightSquare) {
                    result[index] = leftSquare;
                    left++;
                }
                else {
                    result[index] = rightSquare;
                    right--;
                }
                index--;
            }
            return result;
        }

}
