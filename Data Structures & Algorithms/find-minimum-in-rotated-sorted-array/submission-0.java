class Solution {
    public int findMin(int[] nums) {
        int ans=(int)1e9;
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]>=nums[st]){
             ans=Math.min(ans,nums[st]);
             st=mid+1;

            }
            else{
                 ans=Math.min(ans,nums[mid]);
                end=mid-1;

            }
        }
        return ans;
        
    }
}
