class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int n=nums.length;
        List<Integer> nums1=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        for(int i=min;i<max;i++){
            for(int j=0;j<n;j++){
                if(i==nums[j]){
                    break;
                }
                else{
                    if(j==n-1){
                        nums1.add(i);
                    }
                }
            }
        }
        return nums1;
    }
}