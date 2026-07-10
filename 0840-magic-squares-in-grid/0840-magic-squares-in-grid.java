class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int result = 0;
        if(!(m>2)){
            return result;
        }
        int n = grid[0].length;
        if(!(n>2)){
            return result;
        }
       for(int i=0;i<=m-3;i++){
        for(int j=0;j<=n-3;j++){
           
                if(isMagicSquare(i,j,grid)){
                    result++;
                }
            
        }
       }
       return result;
    }
    private boolean isMagicSquare(int x,int y,int[][] matrix){
        Set<Integer> set = new HashSet<Integer>();
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        int[] diagSum = new int[2];
        
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                if(matrix[i][j]>9||(matrix[i][j]<1)){
                    return false;
                }
              if(set.contains(matrix[i][j])){
                return false;
              }
              set.add(matrix[i][j]);
              rowSum[i-x]+=matrix[i][j];
              colSum[j-y]+=matrix[i][j];
            }
        }
        diagSum[0] = matrix[x+0][y+0]+ matrix[x+1][y+1]+matrix[x+2][y+2];
        diagSum[1] = matrix[x+0][y+2] + matrix[x+1][y+1] + matrix[x+2][y+0];
        int sum =   diagSum[0];
        for(int i=0;i<3;i++){
            if(rowSum[i]!=sum){
                return false;
            }
            if(colSum[i]!=sum){
                return false;
            }
        }
        if(diagSum[1]!=sum){
            return false;
        }
        return true;
    }
}