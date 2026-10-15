package gfg60;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {

        int[] nums = {6, 4, 2, 7, 1, 9, 18};
        System.out.println("Result: "+ arrayPairSum(nums));

    }

        private static int arrayPairSum(int[] nums) {
            Arrays.sort(nums);

            int maxSum = 0;

            for(int i = 0; i < nums.length; i+= 2) {
                maxSum += nums[i];
            }
            return maxSum;
        }
}
