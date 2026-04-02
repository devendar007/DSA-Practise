class Solution {
    public int maxProfit(int[] prices) {
        int min=(int)1e9;
        int max=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}
