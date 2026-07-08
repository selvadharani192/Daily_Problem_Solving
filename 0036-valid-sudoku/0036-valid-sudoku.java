class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] column = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];
        for(int i=0;i<9;i++){
            row[i] = new HashSet<Character>();
             column[i] = new HashSet<Character>();
              box[i] = new HashSet<Character>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                                int boxIndex = (i / 3) * 3 + (j / 3);

                if(board[i][j]=='.'){continue;}
                if(row[i].contains(board[i][j])){
                    return false;
                }
                if(column[j].contains(board[i][j])){
                    return false;
                }

                if(box[boxIndex].contains(board[i][j])){
                    return false;
                }
                row[i].add(board[i][j]);
                column[j].add(board[i][j]);
                box[boxIndex].add(board[i][j]);
            }
        }
       return true;
    }
}