class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int it:nums){
            if(st.contains(it)){
                return it;
            }
            st.add(it);
        }
        return -1;
    }
}
