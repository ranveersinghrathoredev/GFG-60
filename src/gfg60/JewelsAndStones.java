package gfg60;

import java.util.Arrays;

public class JewelsAndStones {
    public static void main(String[] args) {
        String s1 = "baa";
        String s2 = "aa";

        System.out.println("Result: "+ (numJewelsInStones(s1, s2)));

    }

        private static int numJewelsInStones(String jewels, String stones) {

            boolean[] isJewel = new boolean[128];

            for(int j = 0; j < jewels.length(); j++) {
                isJewel[jewels.charAt(j)] = true;
            }

            int count = 0;
            for(int s = 0; s < stones.length(); s++) {
                if(isJewel[stones.charAt(s)]) {
                    count++;
                }
            }
            return count;
        }

}
