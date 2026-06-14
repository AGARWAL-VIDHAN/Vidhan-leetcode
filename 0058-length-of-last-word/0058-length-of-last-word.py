class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans=0
        for i in range(len(s)-1,-1 ,-1):
            if s[i]!=" ":
                ans+=1
            elif ans!=0:
                break
        return ans
            
                
        