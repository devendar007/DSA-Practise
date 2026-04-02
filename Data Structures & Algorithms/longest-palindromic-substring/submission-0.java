class Solution {
    public boolean isPal(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int st=-1;
        int end=-1;
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPal(s,i,j)){
                    if(j-i+1>max){
                        st=i;
                        end=j;
                        max=j-i+1;
                    }
                }
            }
        }
        return s.substring(st,end+1);
    }
}
