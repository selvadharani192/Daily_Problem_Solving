class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        genPermutation(nums,res,new ArrayList<Integer>(), new boolean[nums.length]);
        return res;
    }
    private void genPermutation(int[] nums,List<List<Integer>> res,List<Integer> temp,boolean[] taken){
      if(temp.size()>=nums.length){
          res.add(new ArrayList<>(temp));
          return; 
      }
      for(int i=0;i<nums.length;i++){
        if(!taken[i]){
        temp.add(nums[i]);
        taken[i]=true;
        genPermutation(nums,res,temp,taken);
        temp.remove(temp.size()-1);
         taken[i]=false;
        }

      }
    }
}