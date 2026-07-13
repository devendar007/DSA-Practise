class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};

    public int helper(int r,int c,int matrix[][],int dp[][]){
        if(r<0||c<0||r>=matrix.length||c>=matrix[0].length) return 0;
            if(dp[r][c]!=-1) return dp[r][c];
        int ans=1;
        for(int i=0;i<4;i++){
            int nrow=drow[i]+r;
            int ncol=dcol[i]+c;
            if(nrow>=0&&ncol>=0&&nrow<matrix.length&&ncol<matrix[0].length&&matrix[nrow][ncol]>matrix[r][c]){
             ans=Math.max(ans,1+helper(nrow,ncol,matrix,dp));
            }
           
        }
        return dp[r][c]=ans;
    }
    public int longestIncreasingPath(int[][] matrix) {
      
        int max=0;
       int dp[][]=new int[matrix.length][matrix[0].length];
        for(int it[]:dp){
            Arrays.fill(it,-1);
        }
        for(int i=0;i<matrix.length;i++){
           
            for(int j=0;j<matrix[0].length;j++){
             max=Math.max(max,helper(i,j,matrix,dp));
            }
        }
        return max;
    }
}
