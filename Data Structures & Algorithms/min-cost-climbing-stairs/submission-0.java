class Solution {
    public int helper(int idx,int cost[]){
        if(idx>=cost.length) return 0;
        int stepOne=cost[idx]+helper(idx+1,cost);
        int stepTwo=cost[idx]+helper(idx+2,cost);
        return Math.min(stepOne,stepTwo);
    }
    public int minCostClimbingStairs(int[] cost) {
       return Math.min(helper(0,cost),helper(1,cost)); 
    }
}
