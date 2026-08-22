class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sub = "";
        for (int j = 1; j <= strs[0].length(); j++) {
            String curr = strs[0].substring(0, j);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length()<j || !curr.equals(strs[i].substring(0,j))) {
                    return sub;
                }
            }
            sub = curr;
        }
        return sub;
    }
}