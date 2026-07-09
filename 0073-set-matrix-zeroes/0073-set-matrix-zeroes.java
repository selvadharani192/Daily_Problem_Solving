class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> columns = new HashSet<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(Integer row:rows){
            for(int i=0;i<n;i++){
                matrix[row][i]=0;
            }
        }
        for(Integer col:columns){
            for(int i=0;i<m;i++){
                matrix[i][col]=0;
            }
        }
    }
}