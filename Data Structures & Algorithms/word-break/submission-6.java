class Solution {
    public boolean helper(int idx,String s,Set<String> st){
        if(idx>=s.length()) return false;
        for(int i=idx;i<s.length();i++){
            if(st.contains(s.substring(idx,i+1))){
                if(i==s.length()-1) return true;
                if(helper(i+1,s,st)) return true;
            }
        }
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> st=new HashSet<>();
        for(String it:wordDict){
            st.add(it);
        }
        // return helper(0,s,st);
    boolean dp[]=new boolean[s.length()+1];
    for(int i=s.length()-1;i>=0;i--){
        for(int j=i;j<s.length();j++){
            if(st.contains(s.substring(i,j+1))){
                if(j==s.length()-1) dp[i]=true;
                if(dp[j+1]) dp[i]=true;
            }
        }
    }
    return dp[0];
    }
}
