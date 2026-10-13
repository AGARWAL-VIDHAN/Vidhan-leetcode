class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        long sum=0;
        int k=0;
        int n=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[n];
                n--;
            }
            else{
                sum-=arr[k];
                k++;
            }
        }
        return sum;
    }
}