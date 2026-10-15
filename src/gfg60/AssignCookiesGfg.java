package gfg60;

import java.util.Arrays;

public class AssignCookiesGfg {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3};
        int[] arr2 = {1, 1};

        System.out.println("Result: "+ findContentChildren(arr1, arr2));

    }
        private static int findContentChildren(int[] g, int[] s) {

            Arrays.sort(g);
            Arrays.sort(s);

            int childPtr = 0;
            int cookiePtr = 0;

            while(childPtr < g.length && cookiePtr < s.length) {
                if(s[cookiePtr] >= g[childPtr]) {
                    childPtr++;
                }
                cookiePtr++;
            }
            return childPtr;
        }

}
