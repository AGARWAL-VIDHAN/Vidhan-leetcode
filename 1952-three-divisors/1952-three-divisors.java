class Solution {
    public boolean isThree(int n) {
        if(n==1 || n==2){
            return false;
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }
}