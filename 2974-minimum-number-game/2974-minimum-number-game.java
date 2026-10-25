class Solution {
    public int[] numberGame(int[] nums) {
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1 - j; i++) {
                if (nums[i] > nums[i+1]) {
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        List<Integer> arr1=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            arr1.add(nums[i+1]);
            arr1.add(nums[i]);
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<arr1.size();i++){
            arr[i]=arr1.get(i);
        }
        return arr;
    }
}