class Solution {
    public int helper(int idx,int n,int nums[]){
    //     if(i>=n) return 0;
    // int pick=nums[i]+helper(i+2,n,nums);
    // int notpick=helper(i+1,n,nums);
    // return Math.max(pick,notpick);

    int dp[]=new int[n+2];
    for(int i=n-1;i>=idx;i--){
     int pick=0;
      pick=nums[i]+dp[i+2];
     int notpick=0;
    
      notpick=dp[i+1];
     dp[i]=Math.max(pick,notpick);
    }
    return dp[idx];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(helper(1,nums.length,nums),helper(0,nums.length-1,nums));
    }
}
