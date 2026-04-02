class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String t:strs){
            int freq[]=new int[26];
            for(char ch:t.toCharArray()){
                freq[ch-'a']++;
            }
            String s=Arrays.toString(freq);
            mp.putIfAbsent(s,new ArrayList<>());
            mp.get(s).add(t);

        }
        return new ArrayList<>(mp.values());
       

    }
}
