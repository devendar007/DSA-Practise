class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public boolean helper(int r,int c,int k,char board[][],String word,boolean vis[][]){
        if(k==word.length()) return true;
        if(r<0||c<0||r>=board.length||c>=board[0].length||vis[r][c]||word.charAt(k)!=board[r][c]) return false;

        vis[r][c]=true;
        for(int i=0;i<4;i++){
            int nrow=drow[i]+r;
            int ncol=dcol[i]+c;
                if(helper(nrow,ncol,k+1,board,word,vis)){
                
                     return true;}
            
        }
        vis[r][c]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean vis[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(i,j,0,board,word,vis)) return true;
                }
            }
        }
        return false;
    }
}
