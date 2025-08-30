public class Leetcode36 {
    class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < cols; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (set.contains(c)) return false; 
                    set.add(c);
                }
            }
        }

        
        for (int j = 0; j < cols; j++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < rows; i++) {
                char c = board[i][j];
                if (c != '.') {
                    if (set.contains(c)) return false;
                    set.add(c);
                }
            }
        }

        
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {
                HashSet<Character> set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[startRow + i][startCol + j];
                        if (c != '.') {
                            if (set.contains(c)) return false;
                            set.add(c);
                        }
                    }
                }
            }
        }

        return true; 
    }
}

    
}
