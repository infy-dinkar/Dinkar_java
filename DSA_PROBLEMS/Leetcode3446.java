public class Leetcode3446 {
    class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int m = 0;
        while (m < rows) {
            int i = m, j = 0;
            java.util.List<Integer> l = new java.util.ArrayList<>();
            while (i < rows && j < cols) {
                l.add(grid[i][j]);
                i++;
                j++;
            }
            java.util.Collections.sort(l, java.util.Collections.reverseOrder());
            i = m; j = 0;
            for (int k = 0; k < l.size(); k++) {
                grid[i][j] = l.get(k);
                i++;
                j++;
            }
            m++;
        }

        int n = 1;
        while (n < cols) {
            int i = 0, j = n;
            java.util.List<Integer> l = new java.util.ArrayList<>();
            while (i < rows && j < cols) {
                l.add(grid[i][j]);
                i++;
                j++;
            }
            java.util.Collections.sort(l);
            i = 0; j = n;
            for (int k = 0; k < l.size(); k++) {
                grid[i][j] = l.get(k);
                i++;
                j++;
            }
            n++;
        }

        return grid;
    }
}

}
