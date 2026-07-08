class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> tracker = new HashSet<String>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                String row = board[i][j]+"r"+i;
                 String column = board[i][j]+"c"+j;
                  String box = board[i][j]+"b"+i/3+"."+j/3;
                  if(tracker.contains(row)||tracker.contains(column)||tracker.contains(box)){
                    return false;
                  }
                  tracker.add(row);
                   tracker.add(column);
                    tracker.add(box);
            }
        }
        return true;
    }
}