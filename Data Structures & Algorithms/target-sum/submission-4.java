class Solution {
    public int helper(int idx,int nums[],int x){
        
        if(idx==nums.length-1){
            if(x==0&&nums[idx]==0) return 2;
            if(x==0||nums[idx]==x)return 1;
            return 0;
        }
       int pick=0;
       if(x>=nums[idx]) pick=helper(idx+1,nums,x-nums[idx]);
       int notpick=helper(idx+1,nums,x);
       return pick+notpick;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int tSum=0;
        for(int i=0;i<nums.length;i++){
        tSum+=nums[i];
        }
        int x=(tSum-target)/2;
        if((tSum-target)%2!=0) return 0;
        return helper(0,nums,x);
    }
}
