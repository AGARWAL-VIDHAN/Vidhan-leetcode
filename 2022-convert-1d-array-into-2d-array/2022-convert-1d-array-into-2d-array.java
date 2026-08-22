class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] array=new int[m][n];
       
        if (original.length != m*n){
            int[][] array2=new int[0][0];
            return array2;
        }
        int count=0;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                array[i][j]=original[count];
                count++;
            }
        }

        
        return array;

        
    }
}