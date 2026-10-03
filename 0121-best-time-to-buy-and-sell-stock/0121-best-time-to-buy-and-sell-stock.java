class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int low=prices[0];
        for(int i=0;i<prices.length;i++){
            int temp=prices[i];
            int c=temp-low;
            profit=Math.max(c,profit);
            low=Math.min(low,temp);
        }
        return profit;
    }
}