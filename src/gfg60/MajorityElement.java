package gfg60;

class MajorityElement {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 3};
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//       int ans =  majorityElement(nums1);
        int ans =  majorityElement(nums);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        int actualCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                actualCount++;
            }
        }
        if (actualCount > nums.length / 2) {
            return candidate;
        }
        return -1;
    }
}

