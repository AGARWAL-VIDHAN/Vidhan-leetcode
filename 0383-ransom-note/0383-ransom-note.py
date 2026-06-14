class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        a=list(ransomNote)
        b=list(magazine)
        for i in range(len(a)):
            if a[i] not in b:
                return False
                break
            else:
                b.remove(a[i])
        return True