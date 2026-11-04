class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int r=0;
        int n=nums.length;
        int pro=1;
        int count=0;
        while(r<n){
            pro*=nums[r];
            while(pro>=k && l<=r){
                pro/=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}