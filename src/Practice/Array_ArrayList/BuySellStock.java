package Practice.Array_ArrayList;

public class BuySellStock {
    //    Leetcode 121
    // Naive Approach  Time Complexity O(n^2) space complexity O(1)
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int newProfit = prices[j] - prices[i];
                if (newProfit > profit) {
                    profit = newProfit;
                }
            }
        }
        if (profit == 0) return 0;
        return profit;
    }

    //    Optimal Approach Time commplexity O(n) Space Complexity O(1)
    public static int OptimalmaxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {4, 1, 3, 6, 3, 6, 2, 7, 2};
        int result = OptimalmaxProfit(prices);
        System.out.println(result);
    }
}
