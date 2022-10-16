class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        
        int min = prices[0];
        int max = prices[0];
        int profit = 0;
        
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = prices[i];
            }
            if (prices[i+1] > max) {
                max = prices[i+1];
            }
            
            if (max - min > profit) {
                profit = max-min;
            }
        }
        
        return profit;
    }
}