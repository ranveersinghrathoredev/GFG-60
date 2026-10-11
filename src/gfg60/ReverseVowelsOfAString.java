package gfg60;

class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println("Result: "+ reverseVowels(s));
    }
    public static String reverseVowels(String s) {

        if(s == null || s.length() == 0)
            return s;

        boolean[] vowels = new boolean[128];
        for(char c: "aeiouAEIOU".toCharArray())    {
            vowels[c] = true;

        }

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right) {
            while(left < right &&
                    !vowels[chars[left]]) {
                left++;
            }

            while(left < right &&
                    !vowels[chars[right]]) {
                right--;
            }

            if(left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }
        return new String(chars);
    }
}