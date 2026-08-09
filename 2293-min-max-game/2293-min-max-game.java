class Solution {
    public int[] game(int[] nums){
        int n=nums.length/2;
        int[] newnums= new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                 newnums[i]=Math.min(nums[2*i],nums[2*i+1]);
            }
            else{
                newnums[i]=Math.max(nums[2*i],nums[2*i+1]);
            }
        }
        return newnums;
    }
    public int minMaxGame(int[] nums) {
        while(nums.length>1){
        nums=game(nums);
    }
    return nums[0];    

        
    }
}