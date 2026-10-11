package gfg60;

public class RansomNote {
    public static void main(String[] args) {
        String magazine = "baa";
        String ransomNote = "aa";
        System.out.println("Result: "+ matchCheck(ransomNote, magazine));
    }

        public static boolean matchCheck(String ransomNote, String magazine) {

            if(ransomNote.length() > magazine.length()) return false;

            int[] charCounts = new int[26];

            for(char c: magazine.toCharArray()) {
                charCounts[c - 'a']++;
            }

            for(char c: ransomNote.toCharArray()) {
                charCounts[c - 'a']--;

                if(charCounts[c - 'a'] < 0)
                    return false;
            }
            return true;
        }
}
