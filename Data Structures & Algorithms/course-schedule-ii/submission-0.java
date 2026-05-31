class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int indegree[]=new int[numCourses];
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int it[]:prerequisites){
            adj.get(it[1]).add(it[0]);
        }
        for(int it[]:prerequisites){
            indegree[it[0]]++;
        }
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(q.size()!=0){
          int node=q.poll();
        
         ans.add(node);
        for(int it:adj.get(node)){
            indegree[it]--;
            if(indegree[it]==0){
                q.add(it);
            }
        }  
        }
        for(int i=0;i<indegree.length;i++){
        if(indegree[i]!=0) return new int[]{};
        }
        int i=0;
        int ans2[]=new int[ans.size()];
        for(int it:ans){
         ans2[i++]=it;
        }
        return ans2;
    }
}
