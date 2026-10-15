package gfg60;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = { 2, 4, 6, 8, 2};
        int[] nums2 = { 2, 6, 3, 9, 2};
        System.out.println("Result: "+ Arrays.toString(intersection(nums1, nums2)));
    }

        private static int[] intersection(int[] nums1, int[] nums2) {

            Set<Integer> set1 = new HashSet<>();
            for(int num: nums1) {
                set1.add(num);
            }

            Set<Integer> intersectSet = new HashSet<>();
            for(int num: nums2) {
                if(set1.contains(num)) {
                    intersectSet.add(num);
                }
            }

            int[] result = new int[intersectSet.size()];
            int index = 0;
            for(int num: intersectSet) {
                result[index++] = num;
            }
            return result;
        }

}


