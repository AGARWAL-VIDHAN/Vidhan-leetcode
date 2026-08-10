class Solution {
    public int helper(int num){
        String s2=String.valueOf(num);
        StringBuilder s=new StringBuilder(s2);        
        int a=0;
        for(int i=0;i<s.length();i++){
             a+=s.charAt(i)-'0';
        }
        return a;
    }
    public int addDigits(int num) {
        while(num%10!=num){
            num=helper(num);
        }        
        return num;       
    }
}