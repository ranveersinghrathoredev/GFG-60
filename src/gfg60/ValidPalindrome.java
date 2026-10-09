package gfg60;

//   this function/logic is suitable when we have a word of string. (means No space, Punctuation, & (non-alphanumeric characters and case sensitivity).

//public class ValidPalindrome {
//    public static void main(String[] args) {
//        String  checkPalindrome = "racecar";
//        boolean result = isPalindrome(checkPalindrome);
//        System.out.println("Result: " + result);
//    }
//
//    private static boolean isPalindrome(String checkPalindrome) {
//        for(int i = 0; i < checkPalindrome.length()/2; i++) {
//            if(checkPalindrome.charAt(i) != checkPalindrome.charAt(checkPalindrome.length() - 1 - i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//}


//  No use of built in Library ( handles all: space, Punctuation, non-alphanumeric characters and case sensitivity.

public class ValidPalindrome {
    public static void main(String[] args) {
        String checkPalindrome = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(checkPalindrome);
        System.out.println("Result: " + result);
    }

    // this function is suitable when we have a word of string. (means No space, Punctuation, & (non-alphanumeric characters and case sensitivity).
    private static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Skip non-alphanumeric for left pointer
            if (!isAlphanumeric(leftChar)) {
                left++;
            }
            // Skip non-alphanumeric for right pointer
            else if (!isAlphanumeric(rightChar)) {
                right--;
            }
            // Both are alphanumeric, compare them case-insensitively
            else {
                if (toLowerCase(leftChar) != toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    // Custom helper to check alphanumeric status using ASCII limits
    private static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

    // Custom helper to convert uppercase to lowercase using ASCII offset
    private static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }
        return c;
    }
}

// note: ASCII VALUES      A: 65    Z: 90,  a: 97   z: 122,   0: 48        9: 57


// built in library code:

//public class ValidPalindrome {
//    public static boolean isPalindrome(String s) {
//        int left = 0;
//        int right = s.length() - 1;
//
//        while (left < right) {
//            // Skip non-alphanumeric characters for the left pointer
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                left++;
//            }
//            // Skip non-alphanumeric characters for the right pointer
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                right--;
//            }
//
//            // Compare the characters case-insensitively
//            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                return false;
//            }
//
//            // Move both pointers inward
//            left++;
//            right--;
//        }
//        return true;
//    }
//}




























