class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m/2;j++){
           
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][m-j-1];
            matrix[i][m-j-1] = temp;
            }
        }
        
    }

    public void swap(int[][] matrix,int r,int c){
        int temp = matrix[r][c];
        matrix[r][c] = matrix[c][r];
        matrix[c][r] = temp;
    }
}