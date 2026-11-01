class Solution {
    public int digitFrequencyScore(int n) {
        int num=n;
        int sum=0;
        while(num>0){
             sum+=num%10;
             num/=10;
        }
        return sum;
    }
}