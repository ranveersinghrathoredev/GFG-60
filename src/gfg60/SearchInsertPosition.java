package gfg60;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 9};
        int target = 5;

        System.out.println(" Return target Index if target present, \n otherwise return the index where it should be present: " + findTargetIndex(nums, target));
    }

    private static int findTargetIndex(int[] nums, int target) {

                int start = 0;
                int end = nums.length - 1;

                while(start <= end) {

                    int mid = start + (end - start) / 2;

                    if(nums[mid] == target) return mid;

                    if(nums[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                return start;
            }
}
