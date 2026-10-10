class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                result.add(nums[i]);
            }
            if (nums[i] >= 10) {
                int n = nums[i];
                int rem = 0;
                List<Integer> arr = new ArrayList<>();
                while (n > 0) {
                    rem = n % 10;
                    n /= 10;
                    arr.add(rem);
                }
                for (int k = arr.size() - 1; k >= 0; k--) {
                    result.add(arr.get(k));
                }
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}