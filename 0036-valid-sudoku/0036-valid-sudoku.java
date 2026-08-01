class Solution {
    public boolean issafe(char[][] board,int row,int col,char str){
         for(int j=0;j<board.length;j++){
            if(j !=col && board[row][j] == str){
                return false;
            }
         }
         for(int j=0;j<board.length;j++){
            if(j !=row && board[j][col] == str){
                return false;
            }
         }
         int sr=3*(row/3);
         int sc=3*(col/3);
         for(int j=sr;j<sr+3;j++){
            for(int k=sc;k<sc+3;k++){
                if((j !=row || k != col) && (board[j][k]==str)){
                    return false;
                }
            }
         }
         return true;
    }
    public boolean helper(char[][] board,int row,int col){
        if(row==board.length){
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
        if(board[row][col] !='.'){
            char str=board[row][col];
            if(issafe(board,row,col,str)){
               if(helper(board,nrow,ncol)){
                return true;
               }
            }
        }
        else{
            return helper(board,nrow,ncol);
        }        
        return false;
    }
    public boolean isValidSudoku(char[][] board) {
        return helper(board,0,0);    
    }
}