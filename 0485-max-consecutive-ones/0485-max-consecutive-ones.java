class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                arr.add(count);
                count = 0;
            }
        }
        arr.add(count);
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }
}