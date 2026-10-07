package gfg60;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 3, 2};
        System.out.println("Second Largest is: "+ secondMax(arr));
    }

    private static int secondMax(int[] arr) {
        if(arr == null|| arr.length < 2) {
            return -1;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }
        return (secondLargest == Integer.MIN_VALUE?-1:secondLargest);

    }
}
