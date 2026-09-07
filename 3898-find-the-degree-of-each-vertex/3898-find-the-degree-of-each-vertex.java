class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] degree =new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int deg=0;
            for(int j=0;j<matrix[0].length;j++ ){
                if(matrix[i][j]==1){
                    deg+=1;
                }
            }
            degree[i]=deg;
        }
        return degree;
        
    }
}