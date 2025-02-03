public class PerfectSquaresLeetcode279 {

    class Solution {
        int [] dp;
    
        public int solve(int n){
            dp=new int[n+1];
            for(int i=1;i<=n;i++){
                dp[i]=-1;
            }
           return numSquares(n);
        }
    
    
        public int numSquares(int n) {
    
            if(n==0) return 0;
    
    
            if(dp==null){
    
                 dp = new int[n + 1];
    
                for(int i=1;i<=n;i++){
                dp[i]=-1;
              }
            
    
            }
    
            if(dp[n]==-1){
                int min=Integer.MAX_VALUE;
                for(int i=1;i*i<=n;i++){
                    min=Math.min(min,numSquares(n-(i*i)));
                }
                dp[n]=min+1;
            }
    
            return dp[n];
            
        }
    }
    
}
