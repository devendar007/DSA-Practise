class Solution {
    public int helper(int idx,int prices[],int buy){
        if(idx>=prices.length){
            if(buy==1) return -(int)1e9;
            return 0;
        }
        if(buy==0){
            return Math.max(-prices[idx]+helper(idx+1,prices,1),helper(idx+1,prices,0));

        }
        
            return Math.max(prices[idx]+helper(idx+2,prices,0),helper(idx+1,prices,1));
        
    }
    public int maxProfit(int[] prices) {
        return helper(0,prices,0);

    }
}
