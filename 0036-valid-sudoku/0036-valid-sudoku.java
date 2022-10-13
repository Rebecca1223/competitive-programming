class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> col = new HashSet<Character>();
        HashSet<Character> box = new HashSet<Character>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (board[i][j] < '1' || board[i][j] > '9'){
                        return false;
                    }
                    if (rows.contains(board[i][j])) {
                        return false;
                    } else {
                        rows.add(board[i][j]);
                    }
                }
                if (board[j][i] != '.') {
                    if (board[j][i] < '1' || board[j][i] > '9'){
                        return false;
                    }
                
                    if (col.contains(board[j][i])) {
                        return false;
                    } else {
                        col.add(board[j][i]);
                    }
                }  
            }
            rows.clear();
            col.clear();
        }
        
        for (int x = 0; x < 9; x+=3) {
            for (int y = 0; y < 9; y+=3) {
                for (int i = x; i < x+3; i++) {
                    for (int j = y; j < y+3; j++) {
                        if (board[i][j] != '.') {
                            if (box.contains(board[i][j])) {
                                return false;
                            } else {
                                box.add(board[i][j]);
                            }
                        }
                    }
                }
                box.clear();
            }
        }
        return true;
    }
}