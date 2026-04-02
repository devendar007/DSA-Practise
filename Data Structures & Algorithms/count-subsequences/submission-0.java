class Solution {
    public int helper(int i,int j,String s1,String s2){
        if(j>=s2.length()) return 1;
        if(i>=s1.length()) return 0;
        if(s1.charAt(i)==s2.charAt(j)){
            return helper(i+1,j,s1,s2)+helper(i+1,j+1,s1,s2); 
        }
       return helper(i+1,j,s1,s2);
     
    }
    public int numDistinct(String s, String t) {
    return helper(0,0,s,t);
    }
}
