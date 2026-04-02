class Solution {
    public int lengthOfLongestSubstring(String s) {
      int j=0;
      int i=0;
      int max=0;
      Map<Character,Integer> mp=new HashMap<>();
      while(j<s.length()){
        mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
        char ch=s.charAt(j);
        while(mp.get(ch)>1){
          mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
          i++;
        }
        max=Math.max(max,j-i+1);
      j++;
      } 
      return max; 
    }
}
