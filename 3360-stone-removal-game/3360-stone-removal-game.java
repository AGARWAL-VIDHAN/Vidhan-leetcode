class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int l=0;
        int r=n;
        while(r>=10-l){
            r-=(10-l);
            l++;
        }
        if(l%2!=0){
            return true;
        }
        else{
            return false;
        }
        
    }
}