public class UniquePathsLeetcode62 {
    class Solution {
        private int[][] dp;
    
        public int uniquePaths(int m, int n) {
            
            dp = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = -1;
                }
            }
            return ways(m - 1, n - 1);
        }
    
        private int ways(int i, int j) {
            if (i < 0 || j < 0) return 0; 
            if (i == 0 && j == 0) return 1; 
            if (dp[i][j] != -1) return dp[i][j]; 
    
            dp[i][j] = ways(i - 1, j) + ways(i, j - 1); 
            return dp[i][j];
        }
    }
    
}
