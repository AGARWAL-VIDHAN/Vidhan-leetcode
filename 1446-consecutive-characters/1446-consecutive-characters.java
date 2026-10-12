class Solution {
    public int maxPower(String s) {
        int count=1;
        List<Integer> arr=new ArrayList<>();
        int k=0;
        while(k<s.length()-1){
            if(s.charAt(k+1)==s.charAt(k)){
                count++;
            }
            else{
                arr.add(count);
                count=1;
            }
            k++;
            
        }
        arr.add(count);
        int max=1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        return max;
    }
}