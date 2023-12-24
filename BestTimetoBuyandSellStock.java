class Solution {
    public int maxProfit(int[] prices) {
        int low= prices[0];
        int max_profit= 0;
        for( int i=0; i< prices.length; i++){
            max_profit= Math.max(max_profit, prices[i]- low);
            if(prices[i]< low){low= prices[i];}
        }
        return max_profit;
    }
}
