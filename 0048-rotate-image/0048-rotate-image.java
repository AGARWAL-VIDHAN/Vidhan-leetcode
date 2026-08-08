class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][] mat=new int[matrix.length][matrix.length];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                mat[i][j]=matrix[i][j];
            }
        }
        
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]=mat[n-1-j][i];
            }
        }
        
    }
}