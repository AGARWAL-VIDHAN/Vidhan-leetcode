class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        String str=s.toLowerCase();
        for(int i=0;i+1<s.length();i++){
            char a=str.charAt(i);
            char b=str.charAt(i+1);
            if(a!=b){
                count++;
            }
        }
        return count;
    }
}