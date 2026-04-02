class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        while(i<n){
            if(i>0&&nums[i]==nums[i-1]) i++;
            else{
            
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                     while(j<k&&nums[j]==nums[j-1]) j++;
                while(j<k&&k<n-1&&nums[k]==nums[k+1]) k--;
                }
                else if(sum<0){
                    j++;
                }
                else k--;
               
            }
            i++;}
        }
        return ans;
        }
}
