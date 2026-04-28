class Solution {
    public void helper(int idx,int nums[],List<List<Integer>> ans,List<Integer> ds){
           ans.add(new ArrayList<>(ds));
        if(idx>=nums.length) return;

      for(int i=idx;i<nums.length;i++){
        if(i!=idx&&nums[i]==nums[i-1]) continue;
        ds.add(nums[i]);
        helper(i+1,nums,ans,ds);
        ds.remove(ds.size()-1);
      }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
     Arrays.sort(nums);        
        helper(0,nums,ans,new ArrayList<>());
        return ans;
    }
}
