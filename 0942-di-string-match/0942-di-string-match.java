class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int min=0;
        int max=n;
        int[] perm=new int[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                perm[i]=min++;    
            }
            else {
                perm[i]=max--;   
            }    
        }
        perm[n]=min;
        return perm;
    }
}