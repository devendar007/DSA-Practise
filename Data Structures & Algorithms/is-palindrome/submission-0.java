class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        s=s.toLowerCase();
        while(i<j){
      char st=s.charAt(i);
      char end=s.charAt(j);
      if(!Character.isLetterOrDigit(st)) i++;
      else if(!Character.isLetterOrDigit(end)) j--;
      else{
        if(st!=end) return false;
        i++;
        j--;
      }

        }
        return true;
    }
}
