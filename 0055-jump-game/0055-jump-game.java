class Solution {
    private int[] memo;
    public boolean helper(int[] nums,int k){
        if(k>=nums.length-1){
            return true;
        }
        if(memo[k]==1){
            return false;
        }
        int maxjump=nums[k];
        for(int j=1;j<=maxjump;j++){    
            if(helper(nums,j+k))
            return true;    
        }
        memo[k]=1;
        return false;
    } 
    public boolean canJump(int[] nums) {
        memo=new int[nums.length];
        return helper(nums,0);
    }
}