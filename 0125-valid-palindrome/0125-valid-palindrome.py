class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        b=""
        for a in s:
            if a.isalnum():
                b+=a
            else:
                continue
        b=b.lower()
        c=b[::-1]
        if c==b:
            return True
        else:
            return False