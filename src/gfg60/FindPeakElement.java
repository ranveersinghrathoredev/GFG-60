package gfg60;

public class FindPeakElement {
    public static void main(String[] args) {

        int[] arr = {2, 4 ,6, 3, 7, 5,8, 1};
        System.out.println("Peak Element Index is: "+ findPeakElement(arr));

    }
        private static int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while(left < right) {
                int mid = left + (right - left) / 2;

                if(nums[mid] < nums[mid + 1]) {
                    left = mid + 1;
                }
                else {
                    right = mid;
                }
            }
            return left;
        }
}
