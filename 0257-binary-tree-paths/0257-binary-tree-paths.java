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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        traverse(result,root,String.valueOf(root.val));
        return result;
    }
    void traverse(List<String> result,TreeNode root,String path){
       
        if((root.left==null&&root.right==null)){
            result.add(path);
            return;
        }
        if(root.left!=null)
       traverse(result,root.left,new String(path+"->"+root.left.val));
     if(root.right!=null)
       traverse(result,root.right,new String(path+"->"+root.right.val));

    }
}