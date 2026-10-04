//package gfg60;


// Ways to solve:
// 1: if array is sorted use Two pointers            TC: O(N)      SC: O(1)
// 2: if array is unsorted: you can sort then use two pointers     TC:   O(NlogN)    SC:   O(1)    OR use a HashSet   TC:   O(N)   SC:  O(N)

//import java.util.Arrays;
//
//public class PairWIthGivenSum {
//    public static void main(String[] args) {
//
//        int[] arr = {2, 4, 6, 8, 12, 14, 16, 18, 19, 22, 26};
//        int target = 27;
//      boolean result = twoSum(arr, target);
//        int[] result = twoSum(arr, target);

//        System.out.println("Result: " + result);
//        System.out.println("Result: " + Arrays.toString(result));
//
//    }
//
//    private static boolean twoSum(int[] arr, int target) {
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            if (arr[start] + arr[end] == target) return true;
//
//            if (arr[start] + arr[end] > target) end--;
//            if (arr[start] + arr[end] < target) start++;
//        }
//        return false;
//    }


        //
//    private static int[] twoSum(int[] arr, int target) {
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            if (arr[start] + arr[end] == target) return new int[] {start, end};
//
//            if (arr[start] + arr[end] > target) end--;
//            if (arr[start] + arr[end] < target) start++;
//        }
//        return new int[] {-1, -1};
//    }
//}


// 2 way:      1:  sort + two pointer

// task:   int[] arr = {26, 22, 6, 8, 12, 18, 16, 14, 19, 4, 2 };          TO          int[] arr = {2, 4, 6, 8, 12, 14, 16, 18, 19, 22, 26};

// do Arrays.sort(arr), then use two pointers.

// second hashset:    O(N) Time and O(N) space in worst case scenario

// HashSet<Integer> seen = new HashSet<>();
// for(int num : arr) {
// int complement = target - num;
// if (seen.contains(complement)) {
// return true;
// }
// seen.add(num);
// }
// return false;
// }




























