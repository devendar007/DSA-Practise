class Solution {
    public void helper(List<String> ans,int count,String s,int n){
    if(s.length()==2*n){
        if(count==0){
            ans.add(s);
        
        }
        return;
    }
    helper(ans,count+1,s+"(",n);
    if(count>0)  helper(ans,count-1,s+")",n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(ans,0,"",n);
        return ans;
    }
}
