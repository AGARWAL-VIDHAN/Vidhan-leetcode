class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        a=str(n)
        l=[]
        b=0
        d="f"
        while d=="f":
            l=[]
            b=0
            for i in range(len(a)):
                l.append(a[i]) 
            for i in range(len(l)):
                b+=int(l[i])**2
            
            
            if b==1:
                return True
            if b==4:
                return False
                
            
            a=str(b)
            d="f"
        