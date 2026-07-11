class Solution {
    public int helper(int idx,int sum,int nums[],int x){
 
   if(idx>=nums.length){
    if(sum==x) return 1;
    return 0;
   }
   int plus=helper(idx+1,sum+nums[idx],nums,x);
   int minus=helper(idx+1,sum-nums[idx],nums,x);
   return plus+minus;


    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper(0,0,nums,target);
    }
}
