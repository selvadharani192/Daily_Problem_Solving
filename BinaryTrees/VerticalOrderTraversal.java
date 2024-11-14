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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, ArrayList<Integer>> frequencyMap = new TreeMap<>();
        verticalOrderTraversal(root, 0, frequencyMap);
        ArrayList<Integer> sortedKeys = new ArrayList<Integer>(frequencyMap.keySet());
        Collections.sort(sortedKeys);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(Integer sortedKey : sortedKeys) {
            List<Integer> values = frequencyMap.get(sortedKey);
            Collections.sort(values);
            result.add(values);
            System.out.println(values);
        }
        return result;
    }

    public void verticalOrderTraversal(TreeNode node,int h, TreeMap<Integer, ArrayList<Integer>> frequencyMap)
    {
        if(node==null)
        {
            return;
        }
        if(frequencyMap.containsKey(h))
        {
            frequencyMap.get(h).add(node.val);
        }
        else
        {
            ArrayList<Integer> arr=new ArrayList<Integer>();
            arr.add(node.val);
            frequencyMap.put(h,arr);
        }

        verticalOrderTraversal(node.left,h-1,frequencyMap);
                        verticalOrderTraversal(node.right,h+1,frequencyMap);

    }
}
