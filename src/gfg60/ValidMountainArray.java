package gfg60;

public class ValidMountainArray {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 4, 2, 1};
        System.out.println(validMountainArray(arr));

    }
        private static boolean validMountainArray(int[] arr) {

            int n = arr.length - 1;
            int i = 0;

            while(i < n && arr[i] < arr[i + 1]) {
                i++;
            }

            if(i == 0 || i == n) return false;

            while(i < n && arr[i] > arr[i + 1]) {
                i++;
            }

            return i == n;
        }
}
