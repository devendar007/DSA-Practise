class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public int swimInWater(int[][] grid) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
        pq.add(new int[]{0,0,grid[0][0]});
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        vis[0][0]=true;
        while(pq.size()!=0){
            int temp[]=pq.poll();
            int r=temp[0];
            int c=temp[1];
            int max=temp[2];
            if(r==grid.length-1&&c==grid[0].length-1) return max;
            for(int i=0;i<4;i++){
                int nrow=drow[i]+r;
                int ncol=dcol[i]+c;
                if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length&&!vis[nrow][ncol]){
                    pq.add(new int[]{nrow,ncol,Math.max(grid[nrow][ncol],max)});
                    vis[nrow][ncol]=true;
                }
            }

        }
        return -1;
    }
}