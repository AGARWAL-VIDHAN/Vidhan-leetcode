class Solution {
    public int maximumLengthSubstring(String s) {
        int maxlen = 0;
        int left = 0;
        int[] freq=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            while (freq[ch - 'a'] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            maxlen = Math.max(maxlen, i - left + 1);
        }
        return maxlen;
    }
}