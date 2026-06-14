class Solution(object):
    def twoSum(self, nums, target):
        i=0
        k=0
        j=0
        for i in range(len(nums)):
            if nums[i] <= target:
                a=target-nums[i]
                for j in range(len(nums)):
                    if i is not j:
                        if a==nums[j]:
                            if i<j:
                                return([i,j])
                            else:
                                return([j,i])
                    else:
                        continue
            else:
                b=target-nums[i]
                for k in range(len(nums)):
                    if i is not k:
                        if b==nums[k]:
                            if i<j:
                                return([i,k])
                            else:
                                return([k,i])
                    else:
                        continue
                