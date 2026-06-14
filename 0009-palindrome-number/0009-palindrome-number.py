class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        s=str(x)
        if s[ : :1] ==s[ : :-1]:
            return True
        else:
            return False