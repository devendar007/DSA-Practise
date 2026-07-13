class Solution {
    public boolean helper(int i,int j,int k,String s1,String s2,String s3,Boolean dp[][][]){
        if(i>=s1.length()&&j>=s2.length()&&k>=s3.length()) return true;
        if((i>=s1.length()&&j>=s2.length())||k>=s3.length()) return false;
        if(i<s1.length()&&j<s2.length()&&s1.charAt(i)!=s3.charAt(k)&&s2.charAt(j)!=s3.charAt(k)) return false;
        if(dp[i][j][k]!=null) return dp[i][j][k];
          boolean first=false;
        if(i<s1.length()&&s1.charAt(i)==s3.charAt(k)){
            first=helper(i+1,j,k+1,s1,s2,s3,dp);
        }
        boolean second=false;
        if(j<s2.length()&&s2.charAt(j)==s3.charAt(k)){
            second=helper(i,j+1,k+1,s1,s2,s3,dp);
        }
        return dp[i][j][k]=first||second;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean dp[][][]=new Boolean[s1.length()+1][s2.length()+1][s3.length()+1];
        // for(Boolean it[][]:dp){
        // for(Boolean it2[]:it){
        //     Arrays.fill(it2,false);
        // }
        // }
        return helper(0,0,0,s1,s2,s3,dp);
    }
}
