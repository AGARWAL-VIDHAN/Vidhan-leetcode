class Solution {
    public int vowelConsonantScore(String s) {
        int c=0;
        int v=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                v++;
            }
            else if(s.charAt(i)!='0' && s.charAt(i)!='1'&&s.charAt(i)!='2'&& s.charAt(i)!='3' && s.charAt(i)!='4' && s.charAt(i)!='5'&& s.charAt(i)!='6' && s.charAt(i)!='7' && s.charAt(i)!='8' && s.charAt(i)!='9' && s.charAt(i)!=' '){
                c++;
            }
        }
        if(c>0){
            return v/c;
        }
        return 0;
    }
}