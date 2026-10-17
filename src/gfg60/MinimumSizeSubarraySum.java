package gfg60;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 5};
        int target = 7;       // 2
//        int target = 5;       // 1

        System.out.println(minSubArrayLen(target, arr));
    }
        private static int minSubArrayLen(int target, int[] nums) {

            int n = nums.length;
            int minLength = Integer.MAX_VALUE;
            int left = 0;
            int currentSum = 0;

            for(int right = 0; right < n; right++)
            {
                currentSum += nums[right];

                while(currentSum >= target) {
                    if(minLength > (right - left + 1)) {
                        minLength = (right - left + 1);
                    }
                    currentSum -= nums[left];
                    left++;
                }
            }
            return minLength = (minLength == Integer.MAX_VALUE) ? 0 : minLength;
        }
}

