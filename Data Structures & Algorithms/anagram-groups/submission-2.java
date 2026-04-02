class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> ans=new ArrayList<>();
      Map<String,List<String>> mp=new HashMap<>();
      for(String s:strs){
    int ch[]=new int[26];
    for(char c:s.toCharArray()){
     ch[c-'a']++;
    }
    String t=Arrays.toString(ch);
    if(!mp.containsKey(t)){
        mp.put(t,new ArrayList<>());
    }
    mp.get(t).add(s);


        
      }  
      for(List<String> t:mp.values()){
       ans.add(t);
      }
      return ans;

    }
}
