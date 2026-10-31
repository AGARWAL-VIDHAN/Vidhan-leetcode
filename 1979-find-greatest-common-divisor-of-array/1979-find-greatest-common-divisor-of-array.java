class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int gcd=1;
        for(int i=1;i<=min;i++){
            if(min % i==0 && max % i==0){
                gcd=Math.max(i,gcd);
            }
        }
        return gcd;
    }
}