class Solution {
    public boolean isPoss(String s ,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public void helper(int idx,String s,List<List<String>> ans,List<String> ds){
        if(idx>=s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPoss(s,idx,i)){
              ds.add(s.substring(idx,i+1));
              helper(i+1,s,ans,ds);
              ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(0,s,ans,new ArrayList<>());
        return ans;
    }
}
