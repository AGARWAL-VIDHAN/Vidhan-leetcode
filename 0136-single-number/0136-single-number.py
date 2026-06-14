class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        index=0
        for i in nums:
            index^=i
        return index