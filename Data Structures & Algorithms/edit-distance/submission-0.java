class Solution {
    public int helper(int i,int j,String s1,String s2){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(s1.charAt(i)==s2.charAt(j)){
          return helper(i-1,j-1,s1,s2);
        }
        int insert=1+helper(i,j-1,s1,s2);
        int delete=1+helper(i-1,j,s1,s2);
        int replace=1+helper(i-1,j-1,s1,s2);
        return Math.min(insert,Math.min(delete,replace));
    }
    public int minDistance(String word1, String word2) {
        return helper(word1.length()-1,word2.length()-1,word1,word2);
    }
}
