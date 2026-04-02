class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int max=0;
        int i=0;
        int j=0;
        while(i<s.length()){
      
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(j));
                j++;
            }
            st.add(s.charAt(i));
            max=Math.max(max,(i-j)+1);
            i++;
        
        }
        return max;
    }
}
