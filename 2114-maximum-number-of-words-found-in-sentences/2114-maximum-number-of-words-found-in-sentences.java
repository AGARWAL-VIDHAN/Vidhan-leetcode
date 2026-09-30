class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] num=new int[sentences.length];
        for(int i=0;i<sentences.length;i++){
            int space=0;
            for(int j=0;j<sentences[i].length();j++){
                 if((sentences[i].charAt(j)) == ' '){
                    space++;
                 }
            }
            num[i]=space+1;
        }
        int max=0;
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        } 
        return max;  
    }
}