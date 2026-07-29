class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        back(nums,new ArrayList<>(),result);
        return result;
    }
    private void back(int[] nums,List<Integer> current,List<List<Integer>> result){
        if(nums.length==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];

            int newarr[]=new int[nums.length-1];
            for(int j=0,k=0;j<nums.length;j++){
                if(j!=i){
                    newarr[k++]=nums[j];
                }
            }
            List<Integer> newnums=new ArrayList<>(current);
            newnums.add(curr);
            back(newarr,newnums,result); 
        }
    }
}