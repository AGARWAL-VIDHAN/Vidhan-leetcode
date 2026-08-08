class Solution {
    public int[][] turn(int[][] mat){
        int n=mat.length;
        int[][] mat2=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat2[j][n-1-i]=mat[i][j];
                
            }
        } 
        return mat2; 
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i=0;i<4;i++){
            if(Arrays.deepEquals(mat,target)){
                return true;
                
            }
            mat=turn(mat);
    }
    return false;    
    }
}