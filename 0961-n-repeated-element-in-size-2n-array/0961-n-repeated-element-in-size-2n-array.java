class Solution {
    public int repeatedNTimes(int[] nums) {
        List<Integer> arr=new ArrayList <>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<arr.size();i++){
            int k=Collections.frequency(arr,arr.get(i));
            if(k>1){
                return arr.get(i);
            }
        }
        return 0;
        
    }
}