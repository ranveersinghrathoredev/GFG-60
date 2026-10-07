package gfg60;

class ThirdLargest {

    public static void main(String[] args) {
        int[] arr= { 2, 8, 11, 3, 7};
        System.out.println();
        System.out.println("Third Largest if Found otherwise First Largest : "+ thirdMax(arr));
    }
    private static int thirdMax(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        long firstMaximum = Long.MIN_VALUE;
        long secondMaximum = Long.MIN_VALUE;
        long thirdMaximum = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMaximum) {
                thirdMaximum = secondMaximum;
                secondMaximum = firstMaximum;
                firstMaximum = arr[i];
            } else if (arr[i] > secondMaximum && arr[i] != firstMaximum) {
                thirdMaximum = secondMaximum;
                secondMaximum = arr[i];
            } else if (arr[i] > thirdMaximum && arr[i] != secondMaximum && arr[i] != firstMaximum) {
                thirdMaximum = arr[i];
            }
        }

        //  cast long to int for result
        return (int) (thirdMaximum == Long.MIN_VALUE ? firstMaximum : thirdMaximum);
    }
}
