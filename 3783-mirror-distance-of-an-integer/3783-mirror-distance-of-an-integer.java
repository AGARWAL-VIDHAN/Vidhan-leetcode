class Solution {
    public int mirrorDistance(int n) {
        int num = 0;
        int a = n;
        while (a > 0) {
            num = num * 10 +  a % 10;
            a /= 10;
        }
        return Math.abs(n - num);
    }
}