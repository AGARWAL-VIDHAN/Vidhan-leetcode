class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> range=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=nums[i];
            while(i+1<n && nums[i+1]==nums[i]+1){
                i++;
            }
            if(nums[i]==start){
                range.add(String.valueOf(start));
            }
            else{
                range.add(String.format("%d->%d",start,nums[i]));
            }
        }
        return range;
    }
}