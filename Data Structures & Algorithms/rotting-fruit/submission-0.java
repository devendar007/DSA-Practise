class Solution {
      int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public int orangesRotting(int[][] grid) {
        int fresh=0;
       Queue<int[]> q=new LinkedList<>();
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==2) q.add(new int[]{i,j});
            if(grid[i][j]==1) fresh++;
        }
       } 
       int countFresh=0;
       int time=0;
       while(q.size()!=0){
        int n=q.size();
       boolean flag=false;
        for(int k=0;k<n;k++){
        int temp[]=q.poll();
        int r=temp[0];
        int c=temp[1];
        
        
        for(int i=0;i<4;i++){
            int nrow=drow[i]+r;
            int ncol=dcol[i]+c;
            if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length&&grid[nrow][ncol]==1){
                grid[nrow][ncol]=2;
                flag=true;
                q.add(new int[]{nrow,ncol});
                countFresh++;
            }
        }
       }
       if(flag) time++;
       }
       return countFresh==fresh?time:-1;
    }
}
