class Solution {
    public boolean issafe(char[][] board,int row,int col,int num){
        for(int j=0;j<board.length;j++){
            if(board[row][j]==(char)(num+'0')){
                return false;
            }
        }
        for(int j=0;j<board.length;j++){
            if(board[j][col]==(char)(num+'0')){
                return false;
            }
        }
        int srow=3*(row/3);
        int scol=3*(col/3);
        for(int j=srow;j<srow+3;j++){
            for(int k=scol;k<scol+3;k++){
                if(board[j][k]==(char)(num+'0')){
                    return false;
                }
            }
        }
    return true;
    }
    public boolean helper(char[][] board,int row,int col){
        if (row==board.length){
            return true;
        }
        int nrow=0;
        int ncol=0;
        if(col==board.length-1){
            nrow=row+1;
            ncol=0;
        }
        else{
            ncol=col+1;
            nrow=row;
        }
        if(board[row][col] != '.'){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }
        else{
        for(int i=1;i<=9;i++){
            if(issafe(board,row,col,i)){
                board[row][col]=(char)(i+'0');
                if(helper(board,nrow,ncol)){
                    return true;
                }
                else{
                    board[row][col]='.';
                }
            }
        }
    }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper( board ,0 ,0);
        
    }
}