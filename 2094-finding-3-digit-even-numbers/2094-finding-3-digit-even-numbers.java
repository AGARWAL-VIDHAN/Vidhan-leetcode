class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int freq[]=new int[10];
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<digits.length;i++){
            freq[digits[i]]++;
        }
        for(int i=1;i<=9;i++){
            if(freq[i]==0){
                continue;
            }
            freq[i]--;
            for(int j=0;j<=9;j++){
                if(freq[j]==0){
                    continue;
                }
                freq[j]--;
                for(int k=0;k<=8;k+=2){
                    if(freq[k]==0){
                        continue;
                    }
                    result.add(i*100+j*10+k);
                }
                freq[j]++;
            }
            freq[i]++;
        }
        int n=result.size();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=result.get(i);
        }
        
        return arr;
    
    }
}