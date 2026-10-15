package gfg60;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 7, 8, 12, 13, 14, 22, 21};
        System.out.println("Even first Odd later: "+ Arrays.toString(sortArrayByParity(nums)));
    }
        private static int[] sortArrayByParity(int[] nums) {

            int left = 0;
            int right = nums.length - 1;

            while(left < right) {
                if(nums[left] % 2 == 0) left++;

                else if(nums[right] % 2 != 0) right--;

                else {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                }

            }
            return nums;
        }
}
