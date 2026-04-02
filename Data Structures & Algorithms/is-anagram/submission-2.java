class Solution {
    public boolean isAnagram(String s, String t) {
   int arr[]=new int[26];
   for(char ch:s.toCharArray()){
    arr[ch-'a']++;
   }
    for(char ch:t.toCharArray()){
    arr[ch-'a']--;
   }
   for(int it:arr){
    if(it>0||it<0) return false;
   }
   return true;
    }
}
