class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int it:stones) pq.add(it);
        while(pq.size()>1){
          int st1=pq.poll();
          int st2=pq.poll();
          int rem=st1-st2;
          if(rem>0) pq.add(rem);
        }
        return pq.size()>0?pq.peek():0;
    }
}
