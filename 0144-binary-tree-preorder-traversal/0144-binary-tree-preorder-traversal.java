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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        preorderTraversal(root,result);
        return result;
    }
      public void preorderTraversal(TreeNode root,List<Integer> list) {
        if(root==null){
            return;
        }
                list.add(root.val);

        preorderTraversal(root.left,list);
        
        preorderTraversal(root.right,list);
    }
    

}