class Solution {
    public String defangIPaddr(String address) {
        String defString="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                defString+="[.]";
            }
            else{
                defString+=address.charAt(i);
            }
        }
        return defString;
    }
}