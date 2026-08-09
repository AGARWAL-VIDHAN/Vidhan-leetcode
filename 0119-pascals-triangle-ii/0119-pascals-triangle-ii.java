class Solution {
    public List<Integer> pascal(List <Integer> arr){
        int n=arr.size();
        List <Integer> arr2=new ArrayList<>(n+1);
        arr2.add(0,1);
        for(int i=1;i<arr.size();i++){    
             arr2.add(i,(arr.get(i-1)+arr.get(i)));
        }
        arr2.add(1);
        
        return arr2;
    }
    public List<Integer> getRow(int rowIndex) {
        List <Integer> arr=new ArrayList<>();
        arr.add(1);
        
        for(int i=0;i<rowIndex;i++){
            arr=pascal(arr);
        }
        return arr;
        
    }
}