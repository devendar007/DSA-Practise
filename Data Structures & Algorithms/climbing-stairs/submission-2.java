class Solution {
    public int helper(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        return helper(n-1)+helper(n-2);
    }
    public int climbStairs(int n) {
        // return helper(n);
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[0]=1;
      for(int i=2;i<=n;i++){
        
      dp[i]=dp[i-1]+dp[i-2];
      }
      return dp[n];
    }
}
