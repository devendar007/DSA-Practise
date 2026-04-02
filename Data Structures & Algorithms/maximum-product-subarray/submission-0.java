class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int n=nums.length-1;
        int max=-(int)1e9;
        for(int i=0;i<nums.length;i++){
        prefix*=nums[i];
        suffix*=nums[n-i];
       max=Math.max(max,Math.max(prefix,suffix));
       if(prefix==0) prefix=1;
       if(suffix==0) suffix=1;
        }
        return max;
    }
}
