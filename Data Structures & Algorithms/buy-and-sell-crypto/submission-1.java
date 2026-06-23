class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int buy = Integer.MAX_VALUE;

        for(int sell:prices){
            buy = Math.min(buy,sell);
            profit = Math.max(profit, sell - buy);
        }
        return profit;
    }
}
