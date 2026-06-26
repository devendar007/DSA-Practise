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
       int ans= helper(0,0,coins,amount);
       return ans==(int)1e9?-1:ans;
    }
}
