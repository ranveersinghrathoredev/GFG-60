package gfg60;

public class FindMiddleIndexInArray {
    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 2, 8, 9, 12, 14};
        System.out.println(findMiddleIndex(arr));
    }

        private static int findMiddleIndex(int[] nums) {

            int leftSum = 0;
            int totalSum = 0;

            for(int num: nums) {
                totalSum += num;
            }

            for(int i = 0; i < nums.length; i++) {
                int rightSum = totalSum - leftSum - nums[i];

                if(leftSum == rightSum) return i;

                leftSum += nums[i];

            }
            return -1;
        }
}
