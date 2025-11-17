class Solution {
    public int uniquePaths(int m, int n) {
        return noUniquePaths(m-1,n-1,new int[m][n]);
    }
    public int noUniquePaths(int m,int n,int[][] memo){
      
        if(m<0||n<0){
            return 0;
        }
        if(m==0&&n==0){
            return 1;
        }
  if(memo[m][n]!=0){
            return memo[m][n];
        }
       memo[m][n] = noUniquePaths(m-1,n,memo)+ noUniquePaths(m,n-1,memo);
       return memo[m][n];
     
    }
}