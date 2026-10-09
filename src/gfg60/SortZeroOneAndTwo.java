package gfg60;

import java.util.Arrays;

public class SortZeroOneAndTwo {
    public static void main(String[] args) {
        int[] sortArr = {2, 0, 1, 0, 2, 2, 0};
        System.out.println(Arrays.toString(sortColors(sortArr)));
    }
        private static int[] sortColors(int[] nums) {

            int left = 0;
            int mid = 0;
            int right = nums.length - 1;

            while(mid <= right) {

                // push zero left side
                if(nums[mid] == 0) {
                    int temp = nums[mid];
                    nums[mid] = nums[left];
                    nums[left]= temp;

                    left++;
                    mid++;
                }

                // check for 1

                else if(nums[mid] == 1) {
                    mid++;
                }

                // check for 2

                else {
                    int temp = nums[mid];
                    nums[mid] = nums[right];
                    nums[right] = temp;

                    right--;
                }
            }
        return nums;
        }
}
