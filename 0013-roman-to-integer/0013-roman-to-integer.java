class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int i = s.length()-1;
        while (i >= 0) {
            if (s.charAt(i) == 'I') {
                ans += 1;
                i--;
            } else if (s.charAt(i) == 'V') {
                if (i>0 && s.charAt(i - 1) == 'I') {
                    ans += 4;
                    i -= 2;
                } else {
                    ans += 5;
                    i -= 1;
                }

            } else if (s.charAt(i) == 'X') {
                if (i>0 && s.charAt(i - 1) == 'I') {
                    ans += 9;
                    i -= 2;
                } else {
                    ans += 10;
                    i -= 1;
                }

            } else if (s.charAt(i) == 'L') {
                if (i>0 && s.charAt(i - 1) == 'X') {
                    ans += 40;
                    i -= 2;
                } else {
                    ans += 50;
                    i -= 1;
                }
            } else if (s.charAt(i) == 'C') {
                if (i>0 && s.charAt(i - 1) == 'X') {
                    ans += 90;
                    i -= 2;
                } else {
                    ans += 100;
                    i -= 1;
                }
            } else if (s.charAt(i) == 'D') {
                if (i>0 && s.charAt(i - 1) == 'C') {
                    ans += 400;
                    i -= 2;
                } else {
                    ans += 500;
                    i--;
                }
            } else if (s.charAt(i) == 'M') {
                if (i>0 && s.charAt(i - 1) == 'C') {
                    ans += 900;
                    i -= 2;
                } else {
                    ans += 1000;
                    i--;
                }
            }
            if(i<0){
                break;
            }
        }
        return ans;
    }
}