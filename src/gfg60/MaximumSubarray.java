package gfg60;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {3, -2, 4, -7, 5, 6 ,9, -10, 3};
        maxSubarray(arr);
//        System.out.println(" Maximum Subarray Sum: " + maxSubarray(arr));
    }


//    private static int maxSubarray(int[] arr) {
//        int currentSum = arr[0];
//        int maxSoFar = arr[0];
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i] > currentSum + arr[i]) {
//                currentSum = arr[i];
//            } else {
//                currentSum = currentSum + arr[i];
//            }
//
//            if(currentSum > maxSoFar) {
//                maxSoFar = currentSum;
//            }
//        }
//        return maxSoFar;
//    }

    // Simple way to solve Maximum Subarray Sum

//    private static int maxSubarray(int[] arr) {
//        int sum = 0;
//        int maxSoFar = arr[0];
//
//        for(int i = 0; i < arr.length; i++) {
//
//            sum = sum + arr[i];
//
//            if(sum > maxSoFar) {
//                maxSoFar = sum;
//            }
//
//            if(sum < 0) {
//                sum = 0;
//            }
//        }
//        return maxSoFar;
//    }
//}

   //  FInd indices of Maximum Subarray Sum.
    private static void maxSubarray(int[] arr) {

        int start = 0;
        int maxSubarrayFirstIndex = 0;
        int maxSubarrayLastIndex = 0;

        int maxSoFar = arr[0];
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if(sum > maxSoFar ) {
                maxSoFar = sum;
                maxSubarrayFirstIndex = start;
                maxSubarrayLastIndex = i;
            }

            if(sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }

        for( int subarrayStart = maxSubarrayFirstIndex; subarrayStart <= maxSubarrayLastIndex; subarrayStart++) {
            System.out.println(subarrayStart);
        }
        System.out.println("Maximum Sum: " + maxSoFar);
        System.out.println("Start Index: " + maxSubarrayFirstIndex);
        System.out.println("End Index: " + maxSubarrayLastIndex);
    }
}