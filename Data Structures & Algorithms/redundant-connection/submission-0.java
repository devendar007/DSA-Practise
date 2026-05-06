class Solution {
    int rank[];
    public int find(int i,int parent[]){
        if(i==parent[i]){
            return i;
        }
        return parent[i]=find(parent[i],parent);
    }
    public boolean union(int u,int v,int parent[]){
    int parent_u=find(u,parent);
    int parent_v=find(v,parent);
    if(parent_u==parent_v) return true;
    else  if(rank[parent_u]==rank[parent_v]){
        parent[parent_v]=parent_u;
        rank[parent_u]++;
    }
    else if(rank[parent_v]>rank[parent_u]){
        parent[parent_u]=parent_v;
    }
    else parent[parent_v]=parent_u;
    return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
         int parent[]=new int[edges.length+1];
         for(int i=0;i<parent.length;i++) parent[i]=i;
         rank=new int[parent.length];
         Arrays.fill(rank,1);
        for(int it[]:edges){
            int u=it[0];
            int v=it[1];
            if(union(u,v,parent)) return new int[]{u,v};
        }

return new int[]{-1,-1};
    }
}
