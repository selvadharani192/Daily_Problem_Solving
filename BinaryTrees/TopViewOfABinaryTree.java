/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class TopViewOfABinaryTree {
    public ArrayList<Integer> solve(TreeNode A) {
        TreeNode left = A;
        TreeNode right=A.right;
        ArrayList<Integer> result=new ArrayList<Integer>();
        while(left!=null)
        {
          result.add(left.val);
          left=left.left;
        }
        while(right!=null)
        {
            result.add(right.val);
            right=right.right;
        }
        return result;
    }
}
