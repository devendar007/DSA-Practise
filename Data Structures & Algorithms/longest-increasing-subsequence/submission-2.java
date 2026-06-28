class Solution {
    public int helper(int idx,int prev,int nums[]){
        if(idx>=nums.length) return 0;
        int pick=0;
        if(nums[idx]>prev){
            pick=1+helper(idx+1,nums[idx],nums);
        }
        int notpick=helper(idx+1,prev,nums);
        return Math.max(pick,notpick);
    }
    public int lengthOfLIS(int[] nums) {
        // return helper(0,-1001,nums);
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                 if(dp[j]+1>dp[i]){
                    dp[i]=1+dp[j];
                    max=Math.max(max,dp[i]);
                 }
                }
            }
        }
        return max;
    }
}
