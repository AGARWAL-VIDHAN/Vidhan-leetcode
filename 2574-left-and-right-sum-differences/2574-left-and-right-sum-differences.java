class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] lsum=new int[nums.length];
        int[] rsum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];            
            }
            rsum[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i-1;j>=0;j--){
                sum+=nums[j];            
            }
            lsum[i]=sum;
        }
        int[] answer=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            answer[i]=Math.abs(lsum[i]-rsum[i]);
        }
        return answer;
        
    }
}