class Solution {
    public boolean isValid(char[][] board,int r,int c,char ch){
        //checking row
        for(int i=0;i<board.length;i++){
            if(board[i][c]==ch) return false;
        }
        //checking col
        for(int j=0;j<board[0].length;j++){
            if(board[r][j]==ch) return false;
        }
        int sRow=(r/3*3);
        int sCol=(c/3*3);
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==ch) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    char ch=board[i][j];
                    board[i][j]='.';
                    if(!isValid(board,i,j,ch)) return false;
                    board[i][j]=ch;
                }
            }
          
        }
        return true;
    }
}
