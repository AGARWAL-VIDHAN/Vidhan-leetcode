class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] id=new int[friends.length];
        int k=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    id[k]=friends[j];
                    k++;
                }
                if(k==friends.length){
                    return id;
                }
                continue;

            }
        }
        return id;   
    }
}