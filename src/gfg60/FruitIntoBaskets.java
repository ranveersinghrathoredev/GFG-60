package gfg60;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {

    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3, 3, 3, 3, 2};
        System.out.println("Result: "+ totalFruit(fruits));
    }

        private static int totalFruit(int[] fruits) {
            int left = 0;
            int maxFruits = 0;

            Map<Integer, Integer> basket = new HashMap<>();

            for(int right = 0; right < fruits.length; right++) {
                basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

                while(basket.size() > 2) {
                    int leftFruit = fruits[left];
                    basket.put(leftFruit, basket.get(leftFruit) - 1);

                    if(basket.get(leftFruit) == 0) {
                        basket.remove(leftFruit);
                    }
                    left++;
                }
                maxFruits = Math.max(maxFruits, right - left + 1);
            }
            return maxFruits;
        }
}
