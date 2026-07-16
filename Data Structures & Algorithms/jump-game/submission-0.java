class Solution {
    public boolean helper(int idx,int nums[]){
        if(idx==nums.length-1) return true;
        if(idx>nums.length) return false;
        if(nums[idx]==0) return false;
        for(int i=idx+1;i<=idx+nums[idx]&&i<nums.length;i++){
            if(helper(i,nums)) return true;
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        //test cases 1,2,0,1,0
        // manual test case 1,3,1,3,0,0,1)
        // 1-> 3
        //3->1,3,0
        return helper(0,nums);
    }
}
