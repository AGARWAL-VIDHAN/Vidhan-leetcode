class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        a=nums.count(val)
        for I in range(a):
            nums.remove(val)
        return(len(nums))