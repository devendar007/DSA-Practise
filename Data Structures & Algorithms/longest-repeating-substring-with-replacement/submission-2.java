class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int ans=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          mp.put(ch,mp.getOrDefault(ch,0)+1);
          int max=Collections.max(mp.values());
          int rem=(i-j+1)-max;
          while(rem>k){
            mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
               j++;
          rem=(i-j+1)-Collections.max(mp.values());
       
          }
          ans=Math.max(ans,i-j+1);
        }
        return ans;

    }
}
