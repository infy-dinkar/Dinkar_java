public class ClimbingStairsLeetcode70 {

    class Solution {

        int[] dp;
    
        public int solve(int n){
            dp=new int[n+1];
            for(int i=0;i<=n;i++){
                dp[i]=-1;
    
            }
    
            return climbStairs(n);
    
        }
    
    
        public int climbStairs(int n) {
    
            if(n<=1) return 1;
    
    
    
            if(dp == null){
                dp = new int[n + 1];
                for(int i=0;i<=n;i++){
                dp[i]=-1;
                }
    
            }
    
    
            if(dp[n]==-1){
                dp[n]=climbStairs(n-1)+climbStairs(n-2);
            }
            return dp[n];
    
    
            
    
    
            
            
        }
    }
    
}
