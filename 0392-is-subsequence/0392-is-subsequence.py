class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        a=len(s)
        count=0
        for i in range(len(s)):
            
            if s[i] in t:
                b=t.index(s[i])
                t=t[b+1:]
                count+=1
        if count==a:
            return True
        else:
            return False