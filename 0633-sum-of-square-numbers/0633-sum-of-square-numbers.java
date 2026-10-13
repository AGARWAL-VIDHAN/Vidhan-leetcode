class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        long j = (long)Math.sqrt(c);
        while (i <= j) {
            long curr = i * i + j * j;
            if (curr > c) {
                j--;
            } else if (curr < c) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}