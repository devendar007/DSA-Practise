class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=-(int)1e9;
        for(int it:nums){
            sum+=it;
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
return max;
    }
}
