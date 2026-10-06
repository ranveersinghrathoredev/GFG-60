package gfg60;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "eerro";
        int result = firstUniqueCharacter(s);
        System.out.println("Index of First Unique Character is: "+ result);

    }
    private static int firstUniqueCharacter(String s) {

        int[] charCounts = new int[26];

        for(int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
