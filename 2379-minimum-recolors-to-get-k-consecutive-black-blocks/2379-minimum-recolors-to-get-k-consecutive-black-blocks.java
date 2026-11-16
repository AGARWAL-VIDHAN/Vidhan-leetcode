class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        int mincount=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        mincount=count;
        int i=0;
        int j=k;
        while(j<blocks.length()){
            if(blocks.charAt(j)=='W'){
                count++;
            }
            if(blocks.charAt(i)=='W'){
                count--;
            }
            i++;
            j++;
            mincount=Math.min(mincount,count);
        }
        return mincount;
    }
}