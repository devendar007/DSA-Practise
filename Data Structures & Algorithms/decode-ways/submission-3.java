class Solution {

    public int helper(int idx,String s,int dp[]){
        if(idx>=s.length()) return 1;
        int count=0;
        if(s.charAt(idx)=='0') return 0;
        if(dp[idx]!=(-1)) return dp[idx];
        for(int i=idx;i<s.length();i++){
            int num=Integer.parseInt(s.substring(idx,i+1));
            if(num>26) break;
           count+=helper(i+1,s,dp);
        }
        return dp[idx]=count;
    }
    public int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(0,s,dp);
     
        
    }
}
