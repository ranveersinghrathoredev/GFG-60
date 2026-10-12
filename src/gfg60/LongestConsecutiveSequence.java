package gfg60;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 5, 8, 7, 9, 2, 5, 6};
        System.out.println("Result: "+ longestConsecutive(arr));
    }

        public static int longestConsecutive(int[] nums) {

            Set<Integer> numSet = new HashSet<>();

            for(int num: nums) {
                numSet.add(num);
            }

            int longestStreak = 0;

            for(int num: numSet) {

                if(!numSet.contains(num - 1)) {

                    int currentNum = num;
                    int currentStreak = 1;

                    while(numSet.contains(currentNum + 1)) {

                        currentNum += 1;
                        currentStreak += 1;

                    }

                    if(longestStreak < currentStreak) {

                        longestStreak = currentStreak;

                    }
                }
            }
            return longestStreak;
        }
}

