class Solution {
    public int[] game(int[] nums){
        int n=nums.length;
        int[] nums2= new int[n-1];
        for(int i=0;i<n-1;i++){
            nums2[i]=(nums[i]+nums[i+1])%10;
        }
        return nums2;
    }
    public int triangularSum(int[] nums) {
         while(nums.length>1){
            nums=game(nums);
         }
       return nums[0];  
    }
}