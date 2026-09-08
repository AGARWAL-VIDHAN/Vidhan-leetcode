class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans=new int[2*nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            count++;
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[count]=nums[i];
            count++;
        }
       return ans; 
    }
}