class Solution {
    public boolean isPall(String s ,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int st=-1;
        int end=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPall(s,i,j)){
                    if(st==(-1)||j-i+1>(end-st+1)){
                        st=i;
                        end=j;
                    }
                }
            }
        }
        return st==-1?"":s.substring(st,end+1);
    }
}
