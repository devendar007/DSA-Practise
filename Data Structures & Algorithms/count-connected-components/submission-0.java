class Solution {
    public void helper(int node,List<List<Integer>> adj,boolean vis[]){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]){
                helper(it,adj,vis);
            }
        }
    }
    public int countComponents(int n, int[][] edges) {
 List<List<Integer>> adj=new ArrayList<>();
 for(int i=0;i<n;i++) adj.add(new ArrayList<>());
 for(int it[]:edges){
    int u=it[0];
    int v=it[1];
    adj.get(u).add(v);
    adj.get(v).add(u);
 }
 int count=0;
 boolean vis[]=new boolean[n];
 for(int i=0;i<n;i++){
if(!vis[i]){
    helper(i,adj,vis);
    count++;
}
 }
 return count;
    }
}
