class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){  
            for(int j=0;j<m;j++){     
                arr[i]+=accounts[i][j];
            }
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
        
    }
}