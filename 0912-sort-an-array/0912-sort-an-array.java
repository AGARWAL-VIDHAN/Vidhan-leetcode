class Solution {
    public void conquer(int[] nums,int si,int mid,int ei){
        int indx1=si;
        int indx2=mid+1;
        int x=0;
        int[] merge=new int[ei-si+1];
        while(indx1<=mid && indx2<=ei){
            if(nums[indx1]<=nums[indx2]){
                merge[x++]=nums[indx1++];
            }else
            merge[x++]=nums[indx2++];
        }
        while(indx1<=mid){            
            merge[x++]=nums[indx1++];        
        }
        while(indx2<=ei){            
            merge[x++]=nums[indx2++];        
        }
        for(int j=si;j<=ei;j++){
            nums[j]=merge[j-si];
        }
    }
    public void divide(int[] nums,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(nums,si,mid);
        divide(nums,mid+1,ei);
        conquer(nums,si,mid,ei);
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        divide(nums,0,n-1);
        return nums;        
    }
}