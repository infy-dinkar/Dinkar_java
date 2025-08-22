public class Leetcode3195 {
    class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int minRow = n, maxRow = -1;
        int minCol = m, maxCol = -1;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }

        
        if (maxRow == -1) return 0;

        int ht = maxRow - minRow + 1;
        int wt = maxCol - minCol + 1;

        return ht * wt;
    }
}

    
}
