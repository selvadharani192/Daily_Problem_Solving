class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
      return minPathSum(grid,new int[m][n],m-1,n-1);
    }
   
   public int minPathSum(int[][] grid,int[][] memo,int m,int n){
        if(m<0||n<0){
            return Integer.MAX_VALUE;
        }
        if(m==0&&n==0){
            return grid[0][0];
        }
        if(memo[m][n]!=0){
            return memo[m][n];
        }
       int down =  minPathSum(grid,memo,m-1,n);
       int right =   minPathSum(grid,memo,m,n-1);

       memo[m][n] = grid[m][n]+Math.min(down,right);
       return memo[m][n];
   }
 
}