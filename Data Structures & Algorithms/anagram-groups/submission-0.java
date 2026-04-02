class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String t=new String(ch);
        if(!mp.containsKey(t)){
          mp.put(t,new ArrayList<>());
        }
        mp.get(t).add(s);
        }
        List<List<String>> ans=new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
       

    }
}
