class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int k = i + 1; k < words.length; k++) {
                int[] store1 = new int[26];
                for (int j = 0; j < words[i].length(); j++) {
                    store1[words[i].charAt(j) - 'a']++;
                }
                int[] store2 = new int[26];
                for (int j = 0; j < words[k].length(); j++) {
                    store2[words[k].charAt(j) - 'a']++;
                }
                for (int j = 0; j < 26; j++) {
                    if ((store1[j] == 0 && store2[j] != 0) || (store2[j] == 0 && store1[j] != 0)) {
                        break;
                    }
                    if (j == 25) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}