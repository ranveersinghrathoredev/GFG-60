package gfg60;
import java.util.Arrays;
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 3, 5, 6, 4};
        int result = buyAndSellStock(prices);
        System.out.println("Max Profit: "+ result);
    }
    private static int buyAndSellStock(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices) {
            if(price < minPrice) {
                minPrice = price;
            } else if(price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}

// TC: O(N)
// SC: O(1)