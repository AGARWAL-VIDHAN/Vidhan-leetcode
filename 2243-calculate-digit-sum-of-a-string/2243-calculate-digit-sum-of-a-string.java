class Solution {
    public String helper(String s,int k){
        
        StringBuilder  s2=new StringBuilder("");
        for (int j=0;j<s.length();j+=k){
            int a=0;
            int b=Math.min(j+k,s.length());
            for (int i=j;i<b;i++){    
                a+=s.charAt(i)-'0';
            }
            s2.append(a);
        }
        return s2.toString();
    }
    public String digitSum(String s, int k) {
        while(s.length()>k){
        s=helper(s,k);    
    }
    return s;
    }
}