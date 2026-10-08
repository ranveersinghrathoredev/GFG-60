package gfg60;

public class IsomorphicStrings {
    public static void main(String[] args) {
//        String s1 = "egg";
//        String s2 = "add";
        String s3 = "foo";
        String s4 = "bar";
//           String s5 = "paper";
//           String s6 = "title";

     boolean result = isIsomorphic(s3, s4);
        System.out.println(result);
    }

     public static boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false;

            int[] mapS = new int[256];
            int[] mapT = new int[256];

            for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);
                char charT = t.charAt(i);

                if (mapS[charS] != mapT[charT]) {
                    return false;
                }

                mapS[charS] = i + 1;
                mapT[charT] = i + 1;
            }

            return true;
        }
}
