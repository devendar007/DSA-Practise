class Solution {
    public int findMin(int[] nums) {
    int min=(int)1e9;
   int st=0;
   int end=nums.length-1;
   while(st<=end){
    int mid=st+(end-st)/2;
    if(nums[mid]>=nums[st]){
        min=Math.min(min,nums[st]);
        st=mid+1;
    }
    else{
        min=Math.min(min,nums[mid]);
        end=mid-1;
    }
   }
   return min;
    }
}
