class Solution {
    public int mirrorDistance(int n) {
        int num=0;
        int a=n;
        int x=0;
        while(a>0){
             x=a%10;
            num=num*10+x;
             a/=10;
        }
        return Math.abs(n-num);
    }
}