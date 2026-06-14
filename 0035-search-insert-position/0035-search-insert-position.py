class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        for i in range(len(nums)):
            if target==nums[i]:
                return i 
        for i in range(len(nums)):
            if nums[len(nums)-1]<target:
                return len(nums)     
            elif nums[i] <target:
                pass
            else:
                return i
                
            
        