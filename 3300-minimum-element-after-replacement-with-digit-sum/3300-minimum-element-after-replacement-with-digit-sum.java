class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = 0;
            int b = nums[i];
            while (b > 10) {
                a += b % 10;
                b /= 10;
                if (b == 10) {
                    a += 1;
                    break;
                } 
                if(b<10){
                    a+=b;
                    break;
                }    
            } 
            
            if (nums[i] == 10) {
                    a = 1;
            }  
            if(nums[i]<10){
                a=nums[i];
            }
            arr[i] = a;

        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}