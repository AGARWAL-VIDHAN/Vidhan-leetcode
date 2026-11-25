class Solution {
    public int minimumCardPickup(int[] cards) {
        int l = 0;
        int r = 0;
        int[] freq = new int[1000001];
        int len = 0;
        int minLen = 100001;
        while (r < cards.length) {
            while (freq[cards[r]] != 0) {
                freq[cards[l]]--;
                if (freq[cards[r]] == 0) {
                    len = r - l + 1;
                    minLen = Math.min(len, minLen);
                }
                l++;
            }
            freq[cards[r]]++;
            r++;
        }
        if (minLen == 100001) {
            return -1;
        }
        return minLen;
    }
}