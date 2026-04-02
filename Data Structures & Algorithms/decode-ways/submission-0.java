class Solution {
    public int helper(int idx,String s){
        if(idx>=s.length()) return 1;
        int count=0;
        for(int i=0;i<=1;i++){
           if(idx+i>=s.length()||s.charAt(idx)=='0') break;
            if(Integer.parseInt(s.substring(idx,idx+i+1))>26) break;
            count+=helper(idx+i+1,s);
        }
        return count;
    }
    public int numDecodings(String s) {
        return helper(0,s);
    }
}
