package gfg60;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {3,  2, 5, 2, 3,  };
        singleNum(nums);
    }

    private static void singleNum(int[] nums) {
        int result = 0;
        for(int num: nums) {
            result = result ^ num;
        }
        System.out.println(result);
    }
}
