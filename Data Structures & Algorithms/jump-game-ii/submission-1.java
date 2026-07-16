class Solution {
    int minG=(int)1e9;
    public int helper(int idx,int nums[],int dp[]){
        if(idx==nums.length-1) return 0;
        if(idx>=nums.length) return (int)1e9;
        if(dp[idx]!=-1) return dp[idx];
        int min=(int)1e9;
        for(int i=idx+1;i<=idx+nums[idx];i++){
        min=Math.min(min,1+helper(i,nums,dp));
        }
        return dp[idx]=min;
    }
    public int jump(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(0,nums,dp);
    }
}

//2,4,1,1,1,1
//
