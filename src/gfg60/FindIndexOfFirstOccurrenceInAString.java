package gfg60;
public class FindIndexOfFirstOccurrenceInAString {
    public static void main(String[] args) {

        String  s = "hersro";
        String findFirstIndexOf = "ro";

        System.out.println("Result: "+ indexOfFirstOccurrenceString(s, findFirstIndexOf));
    }

    private static int indexOfFirstOccurrenceString(String haystack, String needle) {

        int hLen = haystack.length();
        int nLen = needle.length();

        if(hLen < nLen) return -1;
        if(nLen == 0) return 0;


        for(int i = 0; i <= hLen - nLen; i++) {

            int j;

            for(j = 0; j < nLen; j++) {

                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if(nLen == j) return i;
        }
        return -1;
    }
}
