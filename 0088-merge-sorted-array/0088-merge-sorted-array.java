class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right=m+n-1;
        while(n>0){
            if( m>0 && (nums2[n-1]<nums1[m-1])){
                nums1[right]=nums1[m-1];
                m-=1;
            }
            else{
                nums1[right]=nums2[n-1];
                n-=1;
            }
            right-=1;
        }
    }
}