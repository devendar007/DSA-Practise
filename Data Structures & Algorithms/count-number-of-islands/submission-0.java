class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public void helper(int i,int j,char grid[][],boolean vis[][]){
        vis[i][j]=true;
        for(int k=0;k<4;k++){
            int nrow=drow[k]+i;
            int ncol=dcol[k]+j;
            if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length&&grid[nrow][ncol]=='1'&&!vis[nrow][ncol]){
                helper(nrow,ncol,grid,vis);
            }
        }
    }
    public int numIslands(char[][] grid) {
        boolean isVis[][]=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&!isVis[i][j]){
                    count++;
                    helper(i,j,grid,isVis);
                }
            }
        }
        return count;
    }
}
