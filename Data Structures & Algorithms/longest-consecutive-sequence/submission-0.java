class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int it:nums) st.add(it);
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i]-1)) continue;
            else{
                int num=nums[i];
                int count=0;
                while(st.contains(num)){
                    count++;
                    num++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
