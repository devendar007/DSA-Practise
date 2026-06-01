class Solution {
    public boolean helper(int node,int par,List<List<Integer>>adj, boolean vis[]){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]){
         if(helper(it,node,adj,vis)) return true;
            }
            else if(it!=par) return true;
        }
        return false;
    }
    public boolean validTree(int n, int[][] edges) {
    List<List<Integer>> adj=new ArrayList<>();
    for(int i=0;i<n;i++) adj.add(new ArrayList<>());
    for(int it[]:edges){
        int u=it[0];
        int v=it[1];
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    boolean vis[]=new boolean[n];
   
    if(helper(0,-1,adj,vis)) return false;
    for(int i=0;i<n;i++){
        if(!vis[i]) return false;
    }
    
    return true;
    }
}
