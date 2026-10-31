class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int reqLen = Math.min(n, m);
        String ans = "";
        for (int i = reqLen; i > 0; i--) {
            String s2 = str2.substring(0, i);
            if (n % i == 0 && m % i == 0) {
                int len1 = n / i;
                int len2 = m / i;
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (int j = 0; j < len1; j++) {
                    sb1.append(s2);
                }
                for (int j = 0; j < len2; j++) {
                    sb2.append(s2);
                }
                if (sb1.toString().equals(str1) && sb2.toString().equals(str2)) {
                    return s2;
                }

            }
        }
        return ans;
    }
}