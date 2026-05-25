class pair{
    int row;
    int col;
    pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public int helper(int row,int col,int grid[][],boolean vis[][]){
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(row,col));
        int count=0;
    vis[row][col]=true;
     
        while(q.size()!=0){
            pair p=q.poll();
            count++;
            int r=p.row;
            int c=p.col;
           
         
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length&&grid[nrow][ncol]==1&&!vis[nrow][ncol]){
              q.add(new pair(nrow,ncol));
              vis[nrow][ncol]=true;
                }
            }
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1&&!vis[i][j]){
                    max=Math.max(max,helper(i,j,grid,vis));
                }
            }
        }
    return max;
    }
}
