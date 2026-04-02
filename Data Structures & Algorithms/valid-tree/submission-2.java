class Solution {
   public boolean dfs(int node,int par,List<List<Integer>> adj,boolean vis[]){
  
     vis[node]=true;
    for(int neighbour:adj.get(node)){
     if(!vis[neighbour]){
     if(dfs(neighbour,node,adj,vis)) return true;
}
else if(par!=neighbour) return true;
}
return false;

}

    public boolean validTree(int n, int[][] edges) {
     List<List<Integer>> adj=new ArrayList<>();
     for(int i=0;i<n;i++) adj.add(new ArrayList<>());
     for(int edge[]:edges){
       int u=edge[0];
       int v=edge[1];
      adj.get(u).add(v);
      adj.get(v).add(u);

}
   boolean isVisited[]=new boolean[n];
   int count=0;

if(dfs(0,-1,adj,isVisited)) return false;
for(int i=0;i<n;i++) {
    if(!isVisited[i]) return false;
}
return true;
   
    }
}
