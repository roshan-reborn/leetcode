class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, start = prices[0], len = prices.length;
        for (int i=1; i<len;i++){
            if (prices[i] > start) profit += prices[i]-start;
            start = prices[i];
        }
        return profit;
    }
}