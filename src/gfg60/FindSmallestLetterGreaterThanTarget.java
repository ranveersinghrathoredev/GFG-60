package gfg60;

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] lettersArr = {'c', 'f', 'g', 'h'};
//        char target = 'd';
          char target = 'a';
        System.out.println("Target Element: " + nextGreatestLetter(lettersArr, target));
    }

    private static char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        if (letters[left] > target) return letters[left];

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return letters[left % letters.length];
    }
}

// class FindSmallestLetterGreaterThanTarget {
//     private static char nextGreatestLetter(char[] letters, char target) {

//         for(int i = 0; i < letters.length; i++) {
//             if(letters[i] > target ) {
//                 return letters[i];
//             }
//         }
//         return letters[0];
//    }
// }