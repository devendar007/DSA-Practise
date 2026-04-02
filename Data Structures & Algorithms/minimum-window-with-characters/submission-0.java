class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mp=new HashMap<>();
      for(int i=0;i<t.length();i++) mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
      int total=t.length();
      int j=0;
      int i=0;
      int min=(int)1e9;
      int stidx=-1;
      while(j<s.length()){
        if(mp.containsKey(s.charAt(j))){
            mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
            if(mp.get(s.charAt(j))>=0){
                total--;
            }
        }
        while(total==0){
           if(mp.containsKey(s.charAt(i))){
            mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            if(mp.get(s.charAt(i))>0) total++;
            if(min>(j-i+1)){
            min=j-i+1;
            stidx=i;
           }
          
           }
        
            i++;
          
        }
           j++;

      }
      return stidx==-1?"":s.substring(stidx,stidx+min);


    }
}
