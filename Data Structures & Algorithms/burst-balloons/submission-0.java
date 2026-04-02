class Solution {
    public int helper(int i,int j,List<Integer> ans){
        if(i>j) return 0;
        int max=-1;
        for(int k=i;k<=j;k++){
       int cost=ans.get(k)*ans.get(i-1)*ans.get(j+1)+helper(i,k-1,ans)+helper(k+1,j,ans);
       max=Math.max(max,cost);
        }
        return max;
    }
    public int maxCoins(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int it:nums) ans.add(it);
        ans.add(1);
        return helper(1,nums.length,ans);
    }
}
