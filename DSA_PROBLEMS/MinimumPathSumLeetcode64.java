public class MinimumPathSumLeetcode64 {
    class Solution {

        private int[][] dp;
        public int minPathSum(int[][] grid) {
            int n=grid.length;
            int m=grid[0].length;
    
            dp=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    dp[i][j]=-1;
                }
            } 
    
            return ways(n-1,m-1,grid);       
        }
    
        private int ways(int i,int j,int[][] grid){
    
            if(i==0 && j==0 ) return grid[0][0];
            if(i<0 || j<0) return Integer.MAX_VALUE;
            
    
            if(dp[i][j]==-1){
                dp[i][j]=Math.min(ways(i-1,j,grid),ways(i,j-1,grid))+grid[i][j];
            }
            return dp[i][j];
    
        }
    }
    
}
