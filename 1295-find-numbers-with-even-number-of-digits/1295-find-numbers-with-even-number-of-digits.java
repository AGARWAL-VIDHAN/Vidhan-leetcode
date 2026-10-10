class Solution {
    public int findNumbers(int[] nums) {
        int[] digits=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                n=n/10;
                digits[i]++;
            }
        }
        int count=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]%2==0){
                count++;
            }
        }
        return count;
    }
}