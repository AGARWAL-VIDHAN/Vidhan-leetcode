class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int l1 = 1;
        int m1 = 1;
        int l2 = 1;
        int m2 = 1;
        int max1 = 1;
        int max2 = 1;
        int cm1 = 0;
        int cm2 = 0;
        while (m1 < nums.length) {
            if (nums[m1] > nums[m1 - 1]) {
                l1++;
                m1++;
            } 
            else {
                l1 = 1;
                m1++;
            }
            max1 = Math.max(max1, l1);
            if(l1==nums.length){
                 max1=l1;
            }
        }
        while (m2 < nums.length) {
            if (nums[m2] < nums[m2 - 1]) {
                l2++;
                m2++;
            } 
            else { 
                l2 = 1;
                m2++;
            }
            max2 = Math.max(max2, l2);
            if(l2==nums.length){
                 max1=l2;
            }
        }
        return Math.max(max1, max2);
    }
}