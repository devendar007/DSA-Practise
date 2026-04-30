class Solution {
     public void helper(int idx,HashMap<Integer,String> mp,String s,String digits,List<String> ans){
        if(idx>=digits.length()) {
            ans.add(s);
            return;
        }
        String t=mp.get((digits.charAt(idx)-'0'));
        for(char ch:t.toCharArray()){
            helper(idx+1,mp,s+ch,digits,ans);
        }
     }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
       if(digits.length()==0) return ans; 
        HashMap<Integer,String> mp=new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
        helper(0,mp,"",digits,ans);
        return ans;
    }
}
