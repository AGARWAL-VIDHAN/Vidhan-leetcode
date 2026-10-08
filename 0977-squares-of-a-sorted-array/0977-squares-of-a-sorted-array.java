class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int i=n-1;
        int left=0;
        int right=n-1;
        while(left<=right){
            if(nums[left]*nums[left]<=nums[right]*nums[right]){
                arr[i]=nums[right]*nums[right];
                right-=1;
            }
            else{
                arr[i]=nums[left]*nums[left];
                left++;
            }
            i--;
        }
        return arr;
    }
}