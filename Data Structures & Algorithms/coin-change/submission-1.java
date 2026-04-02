class Solution {
    public int helper(int idx,int coins[],int amount){
        if(amount==0) return 0;

        if(idx>=coins.length) return (int)1e9;
        int pick=(int)1e9;
        if(amount>=coins[idx])
        pick=1+helper(idx,coins,amount-coins[idx]);
        int notpick=helper(idx+1,coins,amount);
        return Math.min(pick,notpick);

    }
    public int coinChange(int[] coins, int amount) {
        int ans= helper(0,coins,amount);
        return ans==(int)1e9?-1:ans;
    }
}
