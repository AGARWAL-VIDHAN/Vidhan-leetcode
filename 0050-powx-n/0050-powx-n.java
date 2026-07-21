class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        return 1;
        if(x==0)
        return 0;
        long N=n;
        if (N<0){
            double X=1/x;
             N=-N;
            if(N%2==0){
            return myPow(X*X,(int)(N/2));
        }
        else
        return myPow(X*X,(int)(N/2))*X;
        }
        if(n%2==0){
            return myPow(x*x,(int)(N/2));
        }
        else
        return myPow(x*x,(int)(N/2))*x;
    }
}