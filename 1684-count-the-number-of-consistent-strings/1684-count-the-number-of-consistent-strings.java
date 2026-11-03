class Solution {
    public boolean present(String allowed,String word){
        for(int i=0;i<word.length();i++){
            boolean found=false;
            for(int j=0;j<allowed.length();j++){
                if(word.charAt(i)==allowed.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
             return false;
        }
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(present(allowed,words[i])){
                count++;
            }
        }
        return count;
    }
}