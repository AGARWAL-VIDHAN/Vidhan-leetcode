/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void helper(TreeNode root,List<List<Integer>> ans){
        if(root==null){
            return;
        }
        List<Integer> ans1 = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr= q.remove();
            if(curr==null){
                ans.add(ans1);
                ans1=new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                ans1.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Double> arr=new ArrayList<>();
        helper(root,ans);
        int m=ans.size();
        for(int i=0;i<m;i++){
            int n=(ans.get(i)).size();
            Double sum=0.0;
            for(int j=0;j<n;j++){
                sum+=(ans.get(i)).get(j);
            }
            arr.add(sum/n);
        }
        return arr;
    }
}