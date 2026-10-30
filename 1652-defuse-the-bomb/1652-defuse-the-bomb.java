class Solution {
    public int[] decrypt(int[] code, int k) {
        int p = Math.abs(k);
        int[] arr = new int[code.length];
        int sum = 0;
        int idx=0;
        if (k > 0) {
            for (int i = 0; i < k; i++) {
                sum += code[i + 1];
            }
            arr[0] = sum;
            
            for (int l = 1; l < code.length; l++) {
                if((l + k  - code.length)<0){
                    idx=l + k ;
                }
                else{
                    idx=l + k  - code.length;
                }
                sum += code[idx];
                sum -= code[l];
                arr[l] = sum;
            }
        }
        if(k==0){
            for(int i=0;i<code.length;i++){
                arr[i]=0;
            }
        }
        if(k<0){
            for (int i = 0; i < p; i++) {
                sum += code[code.length-i-1];
            }
            arr[0] = sum;
            for(int i=1;i<code.length;i++){
                if((i - p - 1 )<0){
                    idx=i - p - 1 + code.length ;
                }
                else{
                    idx=i - p - 1;
                }
                sum-=code[idx];
                sum+=code[i-1];
                arr[i]=sum;
            }
        }
        return arr;
    }
}