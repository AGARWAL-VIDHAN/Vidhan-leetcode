class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        a=""
        for i in range(len(digits)):
            a+=str(digits[i])
        b=int(a)
        c=b+1
        z=str(c)
        d=[]
        for i in range(len(z)):
            d.append(int(z[i]))
        return d
        