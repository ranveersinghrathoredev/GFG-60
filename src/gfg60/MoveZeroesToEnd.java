package gfg60;

import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int[] nums = {2, 0, 5, 0, 3, 7};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int nonZeroes = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {

               int temp = nums[nonZeroes];
               nums[nonZeroes] = nums[i];
               nums[i] = temp;
                nonZeroes++;

            }
        }
    }
}
