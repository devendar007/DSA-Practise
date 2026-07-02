class Solution {
    public int helper(int i,int j,String s1,String s2){
        if(i>=s1.length()||j>=s2.length()) return 0;
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+helper(i+1,j+1,s1,s2);
        }
        return Math.max(helper(i+1,j,s1,s2),helper(i,j+1,s1,s2));
    }
    public int longestCommonSubsequence(String s1, String s2) {
        // return helper(0,0,text1,text2);
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(s1.charAt(i)==s2.charAt(j)){
              dp[i][j]= 1+dp[i+1][j+1];
        }
          else dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
            }
        }
        return dp[0][0];
    }
}
