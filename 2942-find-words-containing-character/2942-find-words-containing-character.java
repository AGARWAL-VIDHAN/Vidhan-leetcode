class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(x==words[i].charAt(j)){
                    arr.add(i);
                    break;
                }
            }
        }
        List<Integer> list=new ArrayList<>();
         for(int i=0;i<arr.size();i++){
            list.add(arr.get(i));
         }
        return list;
        
    }
}