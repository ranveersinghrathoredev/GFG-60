package gfg60;

public class toLowerCase {
    public static void main(String[] args) {

        String upper = "HELLO";
        System.out.println("LowerCase: " + changeToLowerCase(upper));

    }
        public static String changeToLowerCase(String s) {

            char[] charArr = s.toCharArray();

            for(int i = 0; i < charArr.length; i++) {
                if(charArr[i] >= 'A' && charArr[i] <= 'Z') {
                    charArr[i] = (char) (charArr[i] + 32);
                }
            }
            return new String(charArr);
        }
}
