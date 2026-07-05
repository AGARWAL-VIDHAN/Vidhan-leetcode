class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int rowstart=0;
        int colstart=0;
        int colend=n-1;
        int rowend=m-1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(rowstart<=rowend && colstart<=colend){
            for(int i=colstart;i<=colend;i++){
                list.add(matrix[rowstart][i]);
            }
            rowstart++;
            for (int i=rowstart;i<=rowend;i++){
                list.add(matrix[i][colend]);
            }
            colend--;
            if(rowstart<=rowend){
                for(int i=colend;i>=colstart;i--){
                    list.add(matrix[rowend][i]);
                }
                rowend--;
            }
            if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                    list.add(matrix[i][colstart]);
                }
                colstart++;
            }
        }
        return list;
    }
}