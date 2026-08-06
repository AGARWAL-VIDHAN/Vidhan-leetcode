class Solution {
    public static boolean issafe(int row,int col,char[][] board){
        int r=row;
        for(int c=col;c>=0 && r>=0;r--,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
         r= row;
        for (int c=col;c<board.length && r>=0;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
         r=row;
        for(int c=col;c<board.length && r<board.length;r++,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
         r=row;
        for(int c=col;c>=0 && r<board.length;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void saveboards(char[][] board,List<List<String>> allboards){
        List<String> newboards=new ArrayList<>();
        String row="";
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+="Q";
                }
                else{
                    row+=".";
                }
            }
            newboards.add(row);
        }
        allboards.add(newboards);
    }
    public static void helper(char[][] board,List<List<String>> allboards,int col){
        if(col==board.length){
            saveboards(board,allboards);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(issafe(row,col,board)){
            board[row][col]='Q';
            helper(board,allboards,col+1);
            board[row][col]='.';
        }
        }
        
    }

    public int totalNQueens(int n) {
        List<List<String>> allboards=new ArrayList<>();
        char [][] board=new char[n][n];
        helper(board,allboards,0);
        return allboards.size();
        
    }
 }
