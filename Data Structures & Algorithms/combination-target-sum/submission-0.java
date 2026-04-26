class Solution {
    public void helper(int idx,int nums[],int x,List<List<Integer>> ans,List<Integer> ds){
       if(x<0) return;
        if(x==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
            if(x<0||idx>=nums.length) return;
        
        if(nums[idx]<=x){
            ds.add(nums[idx]);
            helper(idx,nums,x-nums[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        helper(idx+1,nums,x,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
     List<List<Integer>> ans=new ArrayList<>();
     helper(0,nums,target,ans,new ArrayList<>());
     return ans;   
    }
}
