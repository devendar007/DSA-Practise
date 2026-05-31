class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public void helper(int r,int c, char board[][],boolean vis[][]){
        vis[r][c]=true;
        for(int i=0;i<4;i++){
            int nrow=drow[i]+r;
            int ncol=dcol[i]+c;
            if(nrow>=0&&ncol>=0&&nrow<board.length&&ncol<board[0].length&&!vis[nrow][ncol]&&board[nrow][ncol]=='O'){
                helper(nrow,ncol,board,vis);
            }
        }
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean vis[][]=new boolean[n][m];
     //upper row
     for(int j=0;j<m;j++){
    if(board[0][j]=='O') helper(0,j,board,vis);
     }
     //left
     for(int i=0;i<n;i++){
        if(board[i][0]=='O') helper(i,0,board,vis);
     }
     //bottom
     for(int j=0;j<m;j++){
        if(board[n-1][j]=='O') helper(n-1,j,board,vis);
     }
     //right
     for(int i=0;i<n;i++){
        if(board[i][m-1]=='O') helper(i,m-1,board,vis);
     }
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(board[i][j]=='O'&&!vis[i][j]) board[i][j]='X';
        }
     }
    }
}
