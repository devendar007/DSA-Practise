class Solution {
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void helper(int idx,int nums[],List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int it:nums) ds.add(it);

            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<nums.length;i++){
        swap(nums,i,idx);
        helper(idx+1,nums,ans);
        swap(nums,i,idx);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,nums,ans);
        return ans;
    }
}
