package gfg60;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 0, 4};
        int[] arr2 = {2, 4, 5, 1, 6};

        System.out.println("Result: "+ canJump(arr2));

    }

    private static boolean canJump(int[] arr) {

        int maxIndex = 0;

        for(int i = 0; i < arr.length; i++) {

            if(i > maxIndex) return false;

            if(maxIndex < (i + arr[i])) maxIndex = i + arr[i];

            if(maxIndex > arr.length) return true;
        }
        return true;
    }
}
