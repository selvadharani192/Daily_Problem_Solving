class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combinations(result,new ArrayList<Integer>(),k,n,1);
        return result;
    }
    void combinations(List<List<Integer>> combinations,List<Integer> combination,int k,int n,int itr){
       if(combination.size()==k){
        combinations.add(new ArrayList<Integer>(combination));
        return;
       }
       for(int i=itr;i<=n;i++){
        combination.add(i);
        combinations(combinations,combination,k,n,i+1);
        combination.remove(combination.size()-1);
       }
    }
}