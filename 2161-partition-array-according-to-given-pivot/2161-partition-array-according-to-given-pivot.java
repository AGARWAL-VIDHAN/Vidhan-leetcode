class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>(); 
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                list1.add(nums[i]);
            }
            else if(nums[i]>pivot){
                list2.add(nums[i]);
            }
            else{
                list3.add(nums[i]);
            }
        }
        int count=0;
        for(int i=0;i<list1.size();i++){
            nums[i]=list1.get(i);
            count++;
        }
        for(int i=0;i<list3.size();i++){
            nums[count]=list3.get(i);
            count++;
        }
        
        for(int i=0;i<list2.size();i++){
            nums[count]=list2.get(i);
            count++;
        }
        return nums;
    }
}