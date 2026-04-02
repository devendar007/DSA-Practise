class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int ans=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        while(i<n){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            int max=Collections.max(mp.values());
            int change=i-j+1-max;
            if(change>k){
                mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
                change=i-j+1-Collections.max(mp.values());
                j++;
            }
            ans=Math.max(ans,i-j+1);
            i++;
        }

return ans;

    }
}
