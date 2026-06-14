class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        l=[]
        i=0
        j=0
        for i in range(len(nums1)):
            for j in range(len(nums2)):
                if nums1[i]==nums2[j]:
                
                    if j!= int(len(nums2)-1):
                        for k in range(j+1,len(nums2)):
                            if nums2[j]<nums2[k]:
                                l.append(nums2[k])
                                break
                            elif k==len(nums2)-1:
                                l.append(-1)
                            
                            else:
                                continue                     
                        
                    else:
                        l.append(-1)
                    if i==len(nums1):
                        break
                else:
                    continue 
            
        
        return l