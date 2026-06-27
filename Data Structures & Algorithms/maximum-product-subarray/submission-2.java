class Solution {
    public int maxProduct(int[] nums) {
       int lsum=1;
       int rsum=1;
       int max=-(int)1e9;
       for(int i=0;i<nums.length;i++){
      lsum*=nums[i];
      rsum*=nums[nums.length-1-i];
      max=Math.max(max,Math.max(lsum,rsum));
        if(lsum==0) lsum=1;
        if(rsum==0) rsum=1;

       }
       return max;
    }
}
