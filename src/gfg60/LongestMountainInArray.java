package gfg60;

public class LongestMountainInArray {
    public static void main(String[] args) {
        int[] arr ={2, 1, 3, 5, 7, 4, 3, 2, 5};
        System.out.println(longestMountain(arr));
    }
        private static int longestMountain(int[] arr) {
            int n = arr.length;
            int maxLen = 0;
            int i = 0;

            while(i < n) {
                int base = i;

                while(base + 1 < n && arr[base] < arr[base + 1]) {
                    base++;
                }

                if(base == i) {
                    i++;
                    continue;
                }
                int peak = base;

                while(base + 1 < n && arr[base] > arr[base + 1]) {
                    base++;
                }
                if(base == peak) {
                    i++;
                    continue;
                }
                maxLen = Math.max(maxLen,base - i + 1);
                i = base;
            }
            return maxLen;
        }
}
