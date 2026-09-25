class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr2[count]=0;
                count++;
            }
        }
        for(int i=count;i<n;i++){
            arr2[i]=1;
        }
        return arr2;
    }
}