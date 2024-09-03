class Solution {
    public int maxProfit(int[] prices) {
        // Edge case: if there are fewer than 2 prices, no profit is possible
        if (prices.length < 2) {
            return 0;
        }

        int min = prices[0]; // Initialize min to the first price
        int max_profit = 0;  // Initialize max_profit to 0

        // Iterate through the prices starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // Calculate the profit if we sold on day i
            int profit = prices[i] - min;
            
            // Update max_profit if the current profit is higher
            if (profit > max_profit) {
                max_profit = profit;
            }

            // Update min price if a new lower price is found
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        return max_profit;
    }
}
