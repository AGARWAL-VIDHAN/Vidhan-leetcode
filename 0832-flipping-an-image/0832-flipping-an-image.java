class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flip=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                flip[i][j]=image[i][image[0].length-j-1];
                if(flip[i][j]==0){
                    flip[i][j]=1;
                }
                else{
                    flip[i][j]=0;
                }
            }
        }
        
       return flip;
        
    }
}