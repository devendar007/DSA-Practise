class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int it[]:times){
            adj.get(it[0]).add(new int[]{it[1],it[2]});
        }
        int dist[]=new int[n+1];
        Arrays.fill(dist,(int)1e9);
       dist[k]=0;
        pq.add(new int[]{k,0});
        while(pq.size()!=0){
            int temp[]=pq.poll();
            int nodeU=temp[0];
            int time=temp[1];
            
          
          for(int[] it:adj.get(nodeU)){
          int v=it[0];
          int timeN=it[1];
          int distV=dist[v];
          if(time+timeN<distV){
            pq.add(new int[]{v,time+timeN});
            dist[v]=time+timeN;
          }
          }
        }
        int max=-(int)1e9;
        for(int i=1;i<=n;i++){
          if(dist[i]==(int)1e9) return -1;
          max=Math.max(max,dist[i]);
        }
        return max;
    }
}
