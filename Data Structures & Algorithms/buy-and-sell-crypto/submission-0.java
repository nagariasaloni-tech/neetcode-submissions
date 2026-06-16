class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int buyPrice = prices[0];

        for(int sellPrice:prices){
            buyPrice = Math.min(buyPrice,sellPrice);
            maxProfit = Math.max(maxProfit, sellPrice-buyPrice);
        }

        return maxProfit;
    }
}
