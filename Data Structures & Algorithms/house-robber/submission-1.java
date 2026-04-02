class Solution {
    public int helper(int idx,int nums[]){
   if(idx>=nums.length) return 0;
   int pick=nums[idx]+helper(idx+2,nums);
   int notpick=helper(idx+1,nums);
   return Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        // return helper(0,nums);
        int dp[]=new int[nums.length+2];
        for(int i=nums.length-1;i>=0;i--){
          int pick=0,notpick=0;

          pick=nums[i]+dp[i+2];
         notpick=dp[i+1];
        dp[i]=Math.max(pick,notpick);
        }
        return dp[0];
    }
}
