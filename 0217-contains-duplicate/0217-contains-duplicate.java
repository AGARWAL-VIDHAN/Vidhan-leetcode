import java.util.Arrays;
class Solution {
    public boolean dupli(int[] nums, int count) { 
            if (nums[count] == nums[count+1]) {
                return true;
            }
        return false;
    }
    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        while (count <nums.length-1) {
            if (dupli(nums, count)) {
                return true;
            }
            count++;
        }
        return false;
    }
}