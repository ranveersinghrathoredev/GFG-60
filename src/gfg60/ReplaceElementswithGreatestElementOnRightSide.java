package gfg60;

import java.util.Arrays;

public class ReplaceElementswithGreatestElementOnRightSide {

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        int[] result = replaceElements(arr);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] replaceElements(int[] arr) {

        int maxValue = -1;

        for(int i = arr.length-1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxValue;

            if(current > maxValue) {
                maxValue = current;
            }
        }
        return arr;
    }
}
