class Solution {
    public int helper(int idx,int x,int amount,int coins[]){
        if(x==amount)return 1;
        if(idx>=coins.length||x>amount) return 0;
        int pick=0;
   if(x+coins[idx]<=amount)  
    pick=helper(idx,x+coins[idx],amount,coins);
     int notpick=helper(idx+1,x,amount,coins);
     return pick+notpick;
    }
    public int change(int amount, int[] coins) {
        // return helper(0,0,amount,coins);
        int dp[][]=new int[coins.length+1][amount+1];
     
        for(int i=coins.length-1;i>=0;i--){
            for(int j=amount;j>=0;j--){
                if(j==amount){
                    dp[i][j]=1;
                    continue;
                }
                int pick=0;
                if(j+coins[i]<=amount){
                    pick=dp[i][j+coins[i]];
                }
                int notpick=dp[i+1][j];
                dp[i][j]=pick+notpick;
            }
        }
        return dp[0][0];
    }
}
