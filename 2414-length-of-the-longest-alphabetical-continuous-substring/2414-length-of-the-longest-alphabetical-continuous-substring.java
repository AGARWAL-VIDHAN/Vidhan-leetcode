class Solution {
    public int longestContinuousSubstring(String s) {
        int k = 0;
        int j = 0;
        int max = 1;
        int x = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            k = s.charAt(i) - 'a';
            j = s.charAt(i + 1) - 'a';
            if (j == k + 1) {
                x++;
            } else {
                x = 1;
            }
            ;
            max = Math.max(max, x);
        }
        return max;
    }
}