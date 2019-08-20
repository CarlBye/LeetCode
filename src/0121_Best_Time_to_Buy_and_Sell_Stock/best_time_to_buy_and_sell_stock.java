class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int min = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - prices[min]);
            min = prices[min] < prices[i] ? min : i;
        }
        return maxProfit;
    }
}
