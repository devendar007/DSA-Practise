class Solution {
    public int helper(int i,int j,String s1,String s2,int dp[][]){
        if(j>=s2.length()) return 1;
        if(i>=s1.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=helper(i+1,j,s1,s2,dp)+helper(i+1,j+1,s1,s2,dp); 
        }
       return dp[i][j]=helper(i+1,j,s1,s2,dp);
     
    }
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()][t.length()];
        for(int it[]:dp) Arrays.fill(it,-1);
            return helper(0,0,s,t,dp);
    }
}
