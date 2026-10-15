package gfg60;

import java.util.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 0, 1,1, 0, 1, 1, 1, 1};
        System.out.println("Result: "+ findMaxConsecutiveOnes(arr));
    }

        private static int findMaxConsecutiveOnes(int[] nums) {

            int currentCount = 0;
            int maxCount = 0;

            for(int num: nums) {

                if(num == 1) {

                    currentCount++;

                    if(maxCount < currentCount) {
                        maxCount = currentCount;
                    }
                }

                else {

                    currentCount = 0;

                }
            }

            return maxCount;

        }

}
