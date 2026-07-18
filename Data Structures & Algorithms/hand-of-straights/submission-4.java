class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        //test    hand = [1,2,4,2,3,5,3,4], groupSize = 4
        //.  hand=[1,2,2,3,3,4,4,5]    groupSize=4
        //. [1,1] [2,2] [3,2][4,2][5,1]
      //  1,2,3,4,
       // 2,3,4,5

       //Input: hand = [1,2,3,3,4,5,6,7], groupSize = 4
       //   [1,1] [2,1] [3,2] [4,1] [5,1] ,[6,1], [7,1]
      // 1,2,3,4,
     //  3,5,6,7
     //Input  hand=[1,2,3,6,2,3,4,7,8]       groupSize=3
     //[1,1] [2,2] [3,2] [4,1] [6,1] [7,1] [8,1]
       //1,2,3  2,3,4
       TreeMap<Integer,Integer> mp=new TreeMap<>();
       for(int i=0;i<hand.length;i++){
        mp.put(hand[i],mp.getOrDefault(hand[i],0)+1);
       }
       while(mp.size()!=0){
        int st=mp.firstKey();
        for(int i=st;i<st+groupSize;i++){
            if(!mp.containsKey(i)) return false;
            mp.put(i,mp.get(i)-1);
            if(mp.get(i)==0) {
                mp.remove(i);
            }
        }
       }
      
      return true;
    }
}
