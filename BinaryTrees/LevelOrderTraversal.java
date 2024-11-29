class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        levelOrder(root,result,0);
        return result;
    }

public void levelOrder(TreeNode treeNode,List<List<Integer>> result,int row)
{
    if(treeNode==null){
        return;
    }
    // levelOrder(treeNode.left,result,row+1);
     List<Integer> innerList;
     if(result.size()>row)
     {
      innerList=  result.get(row);
     }
     else{
     innerList=new ArrayList<Integer>();
     result.add(innerList);
     }
       innerList.add(treeNode.val);
      levelOrder(treeNode.left,result,row+1);
      levelOrder(treeNode.right,result,row+1);
      
}
}

