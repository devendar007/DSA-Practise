class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    int INF=2147483647;
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==0) q.add(new int[]{i,j});
        }
     }
     while(q.size()!=0){
        int temp[]=q.poll();
        int r=temp[0];
        int c=temp[1];
        for(int i=0;i<4;i++){
            int nrow=drow[i]+r;
            int ncol=dcol[i]+c;
            if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length&&grid[nrow][ncol]==INF){
                grid[nrow][ncol]=grid[r][c]+1;
                q.add(new int[]{nrow,ncol});
            }
        }
     }
            }
}
