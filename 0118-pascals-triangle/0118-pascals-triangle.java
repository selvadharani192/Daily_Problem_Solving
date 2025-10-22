class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
             ArrayList<Integer> pattern = new ArrayList<Integer>();
             for(int j=0;j<=i;j++){
                if(j==i||j==0){
  pattern.add(1);
                }
                else{
                 
                  pattern.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
             }
                           result.add(pattern);

        }
        return result;
    }
}