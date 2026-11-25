class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0;
        int r=0;
        int sum=0;
        int maxsum=0;
        int[] freq=new int[10001];
        while(r<nums.length){
            while(freq[nums[r]]!=0){
                sum-=nums[l];
                freq[nums[l]]--;
                l++;
            }
            sum+=nums[r];
            freq[nums[r]]++;
            maxsum=Math.max(sum,maxsum);
            r++;
        }
        return maxsum;
    }
}