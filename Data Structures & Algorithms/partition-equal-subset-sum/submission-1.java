class Solution {
    public boolean helper(int idx,int sum,int x,int nums[]){
        if(sum==x) return true;
        if(idx>=nums.length) return false;
        boolean pick=false;
        if(sum+nums[idx]<=x){
            pick=helper(idx+1,sum+nums[idx],x,nums);
        }
        boolean notpick=helper(idx+1,sum,x,nums);
        return pick||notpick;

    }

    public boolean canPartition(int[] nums) {
       int sum=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       } 
       if(sum%2!=0) return false;
      int x=sum/2;
    //   return helper(0,0,req,nums);
    boolean dp[][]=new boolean[nums.length+1][x+1];
    for(int i=0;i<=nums.length;i++){
        dp[i][x]=true;
    }

    for(int i=nums.length-1;i>=0;i--){
     for(int j=x;j>=0;j--){
        boolean pick=false;
        if(j+nums[i]<=x){
            pick=dp[i+1][j+nums[i]];
        }
        boolean notpick=dp[i+1][j];
        dp[i][j]=pick||notpick;
     }
    }
    return dp[0][0];
    }
}
