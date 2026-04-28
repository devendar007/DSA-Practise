class Solution {
    public void helper(int left,int right,int n,List<String> ans,String s){
        if(left==n&&right==n){
            ans.add(s);
            return;
        }
        if(left<n)
        helper(left+1,right,n,ans,s+"(");
        if(left>right){
            helper(left,right+1,n,ans,s+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new  ArrayList<>();
        helper(0,0,n,ans,"");
        return ans;
    }
}
