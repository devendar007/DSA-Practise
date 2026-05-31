class Solution {
    public boolean helper(int node,List<List<Integer>> adj,boolean vis[],boolean pathVis[]){
    vis[node]=true;
    pathVis[node]=true;
    for(int it:adj.get(node)){
        if(!vis[it]){   
        if(helper(it,adj,vis,pathVis)) return true;    
        }
        else if(pathVis[it]){
            return true;
        }
 
       
    }
    pathVis[node]=false;
    return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int it[]: prerequisites){
            int u=it[0];
            int v=it[1];
            adj.get(u).add(v);
        }
        boolean pathVis[]=new boolean[numCourses];
        boolean vis[]=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!vis[i]&&helper(i,adj,vis,pathVis)) return false; 
        }
        return true;
    }
}
