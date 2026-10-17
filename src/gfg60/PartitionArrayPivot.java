package gfg60;

import java.util.Arrays;

public class PartitionArrayPivot {
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 12, 14, 10, 22, 18, 10, 9};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(arr, pivot)));
    }
        private static int[] pivotArray(int[] nums, int pivot) {

            int n = nums.length;
            int[] ans = new int[n];

            int left = 0;
            int right = n - 1;

            for(int i = 0, j = n - 1; i < n;
                i++, j--) {

                if(nums[i] < pivot) {
                    ans[left] = nums[i];
                    left++;
                }

                if(nums[j] > pivot) {
                    ans[right] = nums[j];
                    right--;
                }

            }

            while(left <= right) {
                ans[left] = pivot;
                left++;
            }
            return ans;
        }
}
