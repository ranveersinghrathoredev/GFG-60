package gfg60;

import java.util.Arrays;

public class ArrayReverseWithoutTemp {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
         arrayReverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // 1: using temp: preferred in real world software development
//    private static void arrayReverse(int[] arr) {
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//    }

    // without using temp
    private static void arrayReverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];

            start++;
            end--;
        }
    }
}
