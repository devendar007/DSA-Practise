class Solution {
    public int helper(int idx,int x,int coins[],int amount){
        if(x==amount) return 0;
        if(x>amount) return (int)1e9;
        if(idx>=coins.length) return (int)1e9;
    int pick=(int)1e9;
    if(x+coins[idx]<=amount){
        pick=1+helper(idx,x+coins[idx],coins,amount);
    }
    int notpick=helper(idx+1,x,coins,amount);

    return Math.min(pick,notpick);
    }
    public int coinChange(int[] coins, int amount) {
    //    int ans= helper(0,0,coins,amount);
    //    return ans==(int)1e9?-1:ans;
    int dp[][]=new int[coins.length+1][amount+1];
    for(int j=0;j<=amount;j++) dp[coins.length][j]=(int)1e9;
        for(int i=0;i<=coins.length;i++) dp[i][amount]=0;
    for(int i=coins.length-1;i>=0;i--){
       for(int j=amount;j>=0;j--){
        int pick=(int)1e9;
        if(j <= amount - coins[i]){
            pick=1+dp[i][j+coins[i]];
        }
        int notpick=dp[i+1][j];
        dp[i][j]=Math.min(pick,notpick);
       }
    }
    return dp[0][0]>=(int)1e9?-1:dp[0][0];
    }
}
