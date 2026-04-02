class Solution {
    public int longestConsecutive(int[] nums) {
    Set<Integer> st=new HashSet<>();
    int max=0;
    for(int it:nums) st.add(it);
    for(int i=0;i<nums.length;i++){
        if(!st.contains(nums[i]-1)){
        int x=nums[i];
         int count=0;
         while(st.contains(x)){
            count++;
            x++;
         }
         max=Math.max(max,count);
        }
    }
    return max;
    }
}
