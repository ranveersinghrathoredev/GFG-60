package gfg60;

public class BestTimeToBuyAndSellStocksII {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 4, 6, 2};
        System.out.println("Result: "+ maxProfit(arr));
    }
        private static int maxProfit(int[] prices) {

            int totalProfit = 0;

            for(int i = 1; i < prices.length; i++) {
                if(prices[i] > prices[i - 1]) totalProfit += prices[i] - prices[i - 1];
            }
            return totalProfit;
        }
    }
