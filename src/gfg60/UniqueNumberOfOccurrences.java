package gfg60;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3,4,  3, 4 ,4,  1};
        System.out.println(uniqueOccurrences(arr));
    }
        private static boolean uniqueOccurrences(int[] arr) {

            int min = arr[0];
            int max = arr[0];

            for(int num: arr) {
                if(num < min) min = num;
                if(num > max) max = num;
            }

            int[] freq = new int[max - min + 1];
            for(int num: arr) {
                freq[num - min]++;
            }

            boolean[] seenFreq = new boolean[arr.length + 1];
            for(int count: freq) {

                if(count > 0) {
                    if(seenFreq[count]) {
                        return false;
                    }
                }
                seenFreq[count] = true;

            }
            return true;
        }
}
