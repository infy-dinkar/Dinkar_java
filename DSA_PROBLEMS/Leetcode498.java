public class Leetcode498 {
    class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int diagonals = m + n - 1;
        int[] res = new int[n * m];
        int idx = 0;

        for (int d = 0; d < diagonals; d++) {
            ArrayList<Integer> l = new ArrayList<>();
            int row, col;

            if (d < m) {
                row = 0;
                col = d;
            } else {
                row = d - m + 1;
                col = m - 1;
            }

            while (row < n && col >= 0) {
                l.add(mat[row][col]);
                row++;
                col--;
            }

            if (d % 2 == 0) {
                Collections.reverse(l);
            }

            for (int i = 0; i < l.size(); i++) {
                res[idx] = l.get(i);
                idx++;
            }
        }
        return res;
    }
}

    
}
