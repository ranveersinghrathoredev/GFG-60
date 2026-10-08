package gfg60;

public class MinCostClimbingStairs {
    public static void main(String[] args) {

//        int[] arr = { 10, 15, 20};
        int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(arr));

    }
    private static int minCostClimbingStairs(int[] cost) {

        if (cost == null || cost.length == 0) return 0;

        int prev2 = cost[0];
        int prev1 = cost[1];
        int minCost = Integer.MIN_VALUE;

        for (int i = 2; i < cost.length; i++) {

            if (prev2 > prev1) {
                minCost = prev1;
            } else {
                minCost = prev2;
            }

            int current = cost[i] + minCost;

            prev2 = prev1;
            prev1 = current;
        }
        return ((prev2 > prev1) ? prev1 : prev2);
    }
}