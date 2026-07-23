class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length-1;
        int col = matrix[0].length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target>=matrix[mid][0]&&target<=matrix[mid][col]){
                int start1 = 0;
                int end1 = col;
                while(start1<=end1){
                    int mid1 = (start1+end1)/2;
                     if(matrix[mid][mid1]==target){
                        return true;
                     }
                     else if(matrix[mid][mid1]>target){
                         end1 = mid1-1;
                     }
                     else{
                        start1 = mid1+1;
                     }
                }
                return false;
            }
            else if(matrix[mid][0]>target){
                end = mid-1;
            }
           else {
                start = mid+1;
            }
        }
        return false;
    }
}