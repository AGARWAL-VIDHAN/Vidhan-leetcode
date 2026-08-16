class Solution {
    public List<List<Integer>> pascal(List<List<Integer>> arr,int m){
        
        int n= arr.get(m).size(); 
         List<Integer> arr2=new ArrayList<>(n+1);
         arr2.add(0,1);
         for (int i=1;i<n;i++){
            arr2.add((arr.get(m).get(i-1) + arr.get(m).get(i)));
         }
         arr2.add(1);
         arr.add(arr2);
         return arr;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr.add(arr1);
        for(int i=0;i<numRows-1;i++){
            arr = pascal(arr,i);
        }
        return arr;
        
        
    }
}