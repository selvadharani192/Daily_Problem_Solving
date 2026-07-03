class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<Integer>();
         
        int startingRow = 0;
        int endingRow = m - 1;
        int startingCol = 0;
        int endingCol = n - 1;

        while(startingRow<=endingRow&&startingCol<=endingCol){
            int column = startingCol;
            while(column<=endingCol){
               res.add(matrix[startingRow][column++]);
            }
            startingRow++;
            int row = startingRow;
            while(row<=endingRow){
               res.add(matrix[row++][endingCol]);
            }
            endingCol--;
           
            column = endingCol;
          if (startingRow <= endingRow) {
            while(column>=startingCol){
            res.add(matrix[endingRow][column--]);
            }
                
         endingRow--;
          }
         row = endingRow;   
         if (startingCol <= endingCol) {
         while(row>=startingRow){
res.add(matrix[row--][startingCol]);
            }
         
            startingCol++;
         }
        }
        return res;
    }
}