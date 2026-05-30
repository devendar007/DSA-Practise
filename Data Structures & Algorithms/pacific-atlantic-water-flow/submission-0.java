class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public void helper(int r,int c,int[][] heights,boolean isVis[][]){
      isVis[r][c]=true;
      for(int i=0;i<4;i++){
        int nrow=drow[i]+r;
        int ncol=dcol[i]+c;
        if(nrow>=0&&ncol>=0&&nrow<heights.length&&ncol<heights[0].length&&heights[nrow][ncol]>=heights[r][c]&&!isVis[nrow][ncol]){
            helper(nrow,ncol,heights,isVis);
        }
      }

    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        boolean isAtl[][]=new boolean[n][m];
        boolean isPaci[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0) helper(i,j,heights,isPaci);
                if(i==n-1||j==m-1) helper(i,j,heights,isAtl);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isPaci[i][j]&&isAtl[i][j]) {
            ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }
}
