class Solution {
    public int count_Hours_To_Eat(int k,int[]piles){
        int count=0;
        for(int it:piles){
            count+=Math.ceil((it*1.0)/(k*1.0));
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
    int st=1;
    int end=-1;
    for(int it:piles) end=Math.max(end,it);
    int ans=-1;
    while(st<=end){
        int mid=st+(end-st)/2;
        if(count_Hours_To_Eat(mid,piles)<=h){
            ans=mid;
            end=mid-1;
        }
        else st=mid+1;
    }
return ans;
    }
}
