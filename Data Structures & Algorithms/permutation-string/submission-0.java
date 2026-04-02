class Solution {
    public boolean isMatched(int arr[],int arr2[]){
        for(int i=0;i<26;i++){
            if(arr[i]!=arr2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;
        for(int i=0;i<n;i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        if(isMatched(freq1,freq2)) return true;
        for(int i=1;i<=(m-n);i++){
           freq2[s2.charAt(i-1)-'a']--;
           freq2[s2.charAt(i+(n-1))-'a']++;
           if(isMatched(freq1,freq2)) return true; 
        }
        return false;
    }
}
