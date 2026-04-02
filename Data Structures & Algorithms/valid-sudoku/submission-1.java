class Solution {
    public boolean valid(int i,int j,char ch,char[][]board){
        //checking row
        for(int k=0;k<board.length;k++){
       if(board[i][k]==ch) return false;
        }
        //checking col
        for(int k=0;k<board.length;k++){
            if(board[k][j]==ch) return false;
        }
        //checking 3*3
        int srow=i/3*3;
        int scol=j/3*3;
        for(int k=srow;k<srow+3;k++){
            for(int l=scol;l<scol+3;l++){
                if(board[k][l]==ch) return false;
            }
        }
        return true;

    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    char ch=board[i][j];
                    board[i][j]='.';
                    if(!valid(i,j,ch,board)) return false;
                      board[i][j]=ch;
                }
            }
        }
        return true;
    }
}
