class Solution {
    public boolean helper(int idx1,int idx2,int idx3,String s1,String s2,String s3,Boolean dp[][][]){
     if(idx3>=s3.length()){
        if(idx1==s1.length()&&idx2==s2.length()) return true;
        return false;
     }
     if(idx1<s1.length()&&idx2<s2.length()&&dp[idx1][idx2][idx3]!=null) return dp[idx1][idx2][idx3];
     boolean first=false;
     boolean second=false;
     if(idx1<s1.length()&&s1.charAt(idx1)==s3.charAt(idx3)) first=helper(idx1+1,idx2,idx3+1,s1,s2,s3,dp);
   if(idx2<s2.length()&&s2.charAt(idx2)==s3.charAt(idx3)) second=helper(idx1,idx2+1,idx3+1,s1,s2,s3,dp);
  
     if(idx1<s1.length()&&idx2<s2.length())
      dp[idx1][idx2][idx3]=first||second;
return  first||second;

    }
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean dp[][][]=new Boolean[s1.length()][s2.length()][s3.length()];
        
        return helper(0,0,0,s1,s2,s3,dp);


    }
}
