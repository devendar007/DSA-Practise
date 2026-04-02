class Solution {
    public void islandsAndTreasure(int[][] grid) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==0) pq.add(new int[]{0,i,j});
        }}
        // boolean vis[][]=new boolean[grid.length][grid[0].length];
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};

        while(pq.size()!=0){
            int temp[]=pq.poll();
            int d=temp[0];
            int r=temp[1];
            int c=temp[2];
            for(int i=0;i<4;i++){
                int nrow=drow[i]+r;
                int ncol=dcol[i]+c;
                if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length&&grid[nrow][ncol]>1+d){
                    grid[nrow][ncol]=1+d;
                    pq.add(new int[]{d+1,nrow,ncol});
                }
            }
        }
        
    }
}
