class Solution { 
    int INF=2147483647;
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public int helper(int r,int c,int grid[][],boolean vis[][]){
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
        q.add(new int[]{r,c,0});
        vis[r][c]=true;
        int min=INF;
        while(q.size()!=0){
            int temp[]=q.poll();
            int row=temp[0];
            int col=temp[1];
            int dist=temp[2];
             if(grid[row][col]==0){
                    min= dist;
                    break;
                }
            for(int i=0;i<4;i++){
                int nrow=drow[i]+row;
                int ncol=dcol[i]+col;

                if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length&&!vis[nrow][ncol]&&(grid[nrow][ncol]==INF||grid[nrow][ncol]==0)){
                    q.add(new int[]{nrow,ncol,dist+1});
                    vis[nrow][ncol]=true;
                }

            }
        }
        for(boolean[]it:vis){
            Arrays.fill(it,false);
        }
        return min;
    }
    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans[][]=new int[n][m];

        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==INF&&!vis[i][j]){
                   int min=helper(i,j,grid,vis);
                   if(min>0) ans[i][j]=min;
                   else ans[i][j]=INF;
                }
                else ans[i][j]=grid[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) grid[i][j]=ans[i][j];
        }
    }
}
