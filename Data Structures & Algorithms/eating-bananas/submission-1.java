class Solution {
    public int helper(int k,int piles[]){
        int count=0;
        for(int i=0;i<piles.length;i++){
          count+=(piles[i]+(k-1))/k;
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int st=1;
        int end=-(int)1e9;
        for(int i=0;i<piles.length;i++){
            end=Math.max(end,piles[i]);
        }
        int ans=end;
        while(st<=end){
            int mid=st+(end-st)/2;
           
           if(helper(mid,piles)<=h){
            ans=mid;
            end=mid-1;
           }
           else st=mid+1;
        }
        return ans;
    }
}
