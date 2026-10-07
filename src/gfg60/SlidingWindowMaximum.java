package gfg60;

import java.util.Arrays;

class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println("Sliding Window Maximum: "+ Arrays.toString(maxSlidingWindow(nums, k)));
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {

        if(nums == null || nums.length == 0 || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];

        for(int i = 0; i <= n-k; i++) {
            int maxVal = Integer.MIN_VALUE;

            for(int j = i; j < i + k; j++) {
                if(maxVal < nums[j]) {
                    maxVal = nums[j];
                }
            }
            result[i] = maxVal;
        }
        return result;
    }
}
