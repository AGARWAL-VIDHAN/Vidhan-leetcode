class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
         String str="";
        for(int i=0;i<words.length;i++){
            int w=0;
            for(int j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);
                w+=weights[c-'a'];
            }
            int m=w%26;
            char ch=(char)('z'-m);
            str=str+ch;


        }
        return str;
        
    }
}