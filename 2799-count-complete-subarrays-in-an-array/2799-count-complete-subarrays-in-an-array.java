class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int i=0;
        int j=0;
        int[] freq1=new int[2001];
        int count=0;
        for(int k=0;k<nums.length;k++){
            freq1[nums[k]]++;
            count++;
            if(freq1[nums[k]]>1){
                count--;
            } 
        }
        int ans=0;
        int count1=0;
        int[] freq2=new int[2001];
        while(i<nums.length){
            if(j==nums.length){
                i++;
                if(i==nums.length){
                    break;
                }
                j=i;
                freq2=new int[2001];
                count1=0;
            }
            int n=nums[j];
            freq2[n]++;
            count1++;
            if(freq2[n]>1){
                count1--;
            }
            if(count1==count){
                ans++;
            }
            j++;  
        }
        return ans;
    }
}