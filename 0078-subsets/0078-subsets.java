class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subSets = new ArrayList<List<Integer>>();
        List<Integer> subSet = new ArrayList<Integer>();
        generateSubSets(subSets,subSet,nums,0);
        return subSets;
    }

    public void generateSubSets(List<List<Integer>> subSets,List<Integer> subSet,int[] array,int itr){
            if(itr==array.length){
                subSets.add(new ArrayList<>(subSet));
                return ;
            }
            subSet.add(array[itr]);
            generateSubSets(subSets,subSet,array,itr+1);
              subSet.remove(subSet.size()-1);
             generateSubSets(subSets,subSet,array,itr+1);

    }
}