class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        i=1
        l=[1,2,3]
        for i in range(3,n):
            l.append(l[i-1]+l[i-2])
        return l[n-1]
            