class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     List<List<String>> ans=new ArrayList<>();
     HashMap<String,List<String>> mp=new HashMap<>();
     for(String s:strs){
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
         arr[s.charAt(i)-'a']++; 
        }
        String t=Arrays.toString(arr);

        mp.putIfAbsent(t,new ArrayList<>());
        mp.get(t).add(s);
     }   
     for(Map.Entry<String,List<String>> entry:mp.entrySet()){
        ans.add(entry.getValue());
     }
     return ans;
    }
}
