class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
   List<List<int[]>> adj=new ArrayList<>();
   for(int i=0;i<n;i++) adj.add(new ArrayList<>());
   for(int flight[]:flights){
    int u=flight[0];
    int v=flight[1];
    int cost=flight[2];
    adj.get(u).add(new int[]{v,cost});
   }

   PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
   pq.add(new int[]{src,0,0});
   while(pq.size()!=0){
 
     
        int temp[]=pq.poll();
     int u=temp[0];
     int cost=temp[1];
     int stop=temp[2];
        if(u==dst) return cost;
     if(stop>k) continue;
   
  
     for(int it[]:adj.get(u)){
        int v=it[0];
        int costV=it[1];
        pq.add(new int[]{v,cost+costV,stop+1});
        
     }
  
     

   } 
  
   return -1;

    }
}
