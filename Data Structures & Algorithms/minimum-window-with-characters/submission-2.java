class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> mp=new HashMap<>();
        int total=t.length();
        int len=(int)1e9;
        if(t.length()>s.length()) return "";
        int st=-1;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)-1);
                if(!(mp.get(ch)<0)){
                total--;
                }
            }
           while(total==0){
            if(mp.containsKey(s.charAt(j))){
             mp.put(s.charAt(j),mp.get(s.charAt(j))+1);
             if(mp.get(s.charAt(j))>0){
                total++;
             }
               if(len>(i-j+1)){
             st=j;
             len=i-j+1;}
             }
             
             j++;

            }

        }
        return len==(int)1e9?"":s.substring(st,st+len);
    }
}
