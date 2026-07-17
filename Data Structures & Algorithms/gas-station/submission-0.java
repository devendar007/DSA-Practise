class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //gas=[1,2,3] cost=[2,3,2]
      //i=0 , idx=0, idx=1,gas=0, 
      //i=1. idx=2,g=0
      //i=2  idx=2 gas=1, i=0
      //i=0. idx=2 gas=2 ,gas=0. return -1;

  //gas = [1,2,3,4], cost = [2,2,4,1]
  //i=0 gas=0; idx= 1,i=1,
  //i=1 gas=0, idx=2,i=2
  //i=3 gas=4  , gas-=1->3 , gas=3, idx=3,i=0,
  //i=0 , idx=3 gas=4-2->2 ,i=1;
  //i=1, idx=3, gas=4-2=2 ,i=2;
  //i=2. idx=3,  gas=5-4=1 ,i=3.  i==idx return idx=3;
        
        int gasSum=0;
        int costSum=0;
        int MOD=cost.length;

        for(int i=0;i<gas.length;i++){
            gasSum+=gas[i];
            costSum+=cost[i];
        }
        if(costSum>gasSum) return -1;
        int idx=0;
        int i=0;
        int g=0;
        while(true){
            g+=gas[i];               
      if(g<cost[i]){
        idx=(i+1)%MOD;
          i=(i+1)%MOD;
        g=0;
      }
      else {
       g=g-cost[i];
       i=(i+1)%MOD;
 if(idx==(i+1)%MOD) return idx;
      }
     
         }
     
    }
}
