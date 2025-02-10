public class DungeonGameLeetcode174 {
    class Solution {
        private int[][] dp;
        
        public int calculateMinimumHP(int[][] dungeon) {
            int n = dungeon.length;
            int m = dungeon[0].length;
    
            dp = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dp[i][j] = -1;
                }
            }
            
            return answer(0, 0, dungeon);
        }
    
        private int answer(int i, int j, int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            
            if (i >= n || j >= m) return Integer.MAX_VALUE;
            
            if (dp[i][j] != -1) return dp[i][j];
            
            if (i == n - 1 && j == m - 1) {
                return Math.max(1, 1 - matrix[i][j]);
            }
            
            int right = answer(i, j + 1, matrix);
            int down = answer(i + 1, j, matrix);
            
            int neededHealth = Math.min(right, down) - matrix[i][j];
            
            return dp[i][j] = Math.max(1, neededHealth);
        }
    }
    
    
}
