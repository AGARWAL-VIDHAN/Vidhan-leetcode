class Solution {
    public int lastRemaining(int n) {
        boolean lefttoright=true;
        int step=1;
        int head=1;
        int remaining=n;
        while(remaining>1){
            if(lefttoright || remaining%2==1){
                head+=step;
            }
            remaining/=2;
            step*=2;
            lefttoright=!lefttoright;
        }
        return head;    
    }
}