class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> arreven=new ArrayList<>();
        List<Integer> arrodd=new ArrayList<>();
        int n=nums.length;
        int k=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arreven.add(nums[i]);
            }
            else{
                arrodd.add(nums[i]);   
            }
        }
        int i=0;
        for(int num:arreven){
            nums[i++]=num;
        }
        for(int num:arrodd){
            nums[i++]=num;
        }
        return nums;
    }
}