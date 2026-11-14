class Solution {
    public int numSub(String s) {
        long i=0;
        int j=0;
        long count=0;
        List<Long> freq=new ArrayList<>();
        while(j<s.length()){
            if(s.charAt(j)=='1'){
                count++;
            }
            else{
                freq.add(count);
                count=0;
            }
            j++;
            if(j==s.length()){
                freq.add(count);
            }
        } 
        long ans=0;
        for(int k=0;k<freq.size();k++){
            i=freq.get(k);
            ans+=(i+1)*i/2;
        }  
        return (int)(ans%1000000007);
    }
}