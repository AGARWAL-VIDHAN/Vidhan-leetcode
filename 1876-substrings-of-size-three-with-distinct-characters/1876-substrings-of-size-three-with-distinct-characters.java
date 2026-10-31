class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        String str = "";
        if(s.length()<3){
            return 0;
        }
        for (int i = 0; i < 3; i++) {
            str += s.charAt(i);
        }
        if (str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2) && str.charAt(0) != str.charAt(2)) {
            count++;
        }
        for (int i = 1; i < s.length()-2; i++) {
            str += s.charAt(2 + i);
            str = s.substring(i,i+3);
            if (str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2) && str.charAt(0) != str.charAt(2)) {
                count++;
            }
        }
        return count;
    }
}