class Solution {
    public int helper(int i,int nums[]){
        if(i>=nums.length) return 0;
        int pick=nums[i]+helper(i+2,nums);
        int notpick=helper(i+1,nums);
        return Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        // return helper(0,nums);
        int dp[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int pick=nums[i];
        if(i+2<nums.length){
        pick+=dp[i+2];
        }
        int notpick=0;
        if(i+1<nums.length)
        notpick=dp[i+1];
        dp[i]=Math.max(pick,notpick);
        }
        return dp[0];
    }
}
