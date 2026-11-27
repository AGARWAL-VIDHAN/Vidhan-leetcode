class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int r=1;
        int l=0;
        int maxlen=0;
        while(r!=nums.length){
            if(nums[r]-nums[l]==1){
                maxlen=Math.max(maxlen,r-l+1);
            }
            if(nums[r]-nums[l]<=1){
                r++;
            }
            else{
                l++;
            }
        }
        return maxlen;
    }
}