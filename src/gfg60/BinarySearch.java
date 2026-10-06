package gfg60;

class BinarySearch {


    public static void main(String[] args) {

        int[] nums = { 2, 4, 6, 8, 14, 16, 22};
        int target = 16;
        int targetIndex = search(nums, target);
        System.out.println("Target Index: " +targetIndex);

    }

    private static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;

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
        return -1;
    }
}
