public class UniquePaths2Leetcode63 {

    class Solution {
        int[][] dp; 
        
        public int uniquePaths(int i, int j, int[][] obstacleGrid) {
            if (i < 0 || j < 0) return 0; 
            if (obstacleGrid[i][j] == 1) return 0; 
            if (i == 0 && j == 0) return 1; 
            
            if (dp[i][j] != -1) return dp[i][j]; 
            
            
            dp[i][j] = uniquePaths(i - 1, j, obstacleGrid) + uniquePaths(i, j - 1, obstacleGrid);
            
            return dp[i][j];
        }
        
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int n = obstacleGrid.length, m = obstacleGrid[0].length;
            
            dp = new int[n][m]; 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dp[i][j] = -1; 
                }
            }
            
            return uniquePaths(n - 1, m - 1, obstacleGrid);
        }
    }
    
    
}
