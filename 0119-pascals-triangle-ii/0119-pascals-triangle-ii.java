class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> dp = new  ArrayList<Integer>();
        dp.add(1);
        for(int i=0;i<rowIndex;i++){
                   ArrayList<Integer> dp1 = new  ArrayList<Integer>();

            dp1.add(1);
           for(int j=1;j<dp.size();j++){
          dp1.add(dp.get(j)+dp.get(j-1)) ;
           }
           dp1.add(1);
            dp = dp1;
        }
        return dp;
    }
}