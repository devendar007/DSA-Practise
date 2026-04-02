class Solution {
    public int helper(int idx,int n,int nums[]){
    //     if(idx>=n)return 0;
    //   int pick=nums[idx]+helper(idx+2,n,nums);
    //   int notpick=helper(idx+1,n,nums);
    //   return Math.max(pick,notpick); 
      int dp[]=new int[n+2];
        for(int i=n-1;i>=idx;i--){
          int pick=0,notpick=0;

          pick=nums[i]+dp[i+2];
         notpick=dp[i+1];
        dp[i]=Math.max(pick,notpick);
        }
        return dp[idx];
    }
    public int rob(int[] nums) {
        int n=nums.length;
         if (n == 1) return nums[0];  
        return Math.max(helper(0,n-1,nums),helper(1,n,nums));
    }
}
