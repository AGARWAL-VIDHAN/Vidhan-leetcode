class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr=new String[m];
        
       arr[0]="";
        for(int j=0;j<n;j++){
            arr[0]+=".";
        }
       for(int i=1;i<m;i++){
        arr[i]="";
           for(int j=0;j<n-1;j++){
            arr[i]+="#";
           }
           arr[i]+=".";
       }
       return arr;
    }
}