public class FibonacciNumberLeetcode509 {

    class Solution {
        int[] dp;
    
        public int solve(int n) {
            dp = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                dp[i] = -1;
            }
            return fib(n);
        }
    
        public int fib(int n) {
            if (n <= 1) return n;
    
            if (dp == null) {
                dp = new int[n + 1];
                for (int i = 0; i <= n; i++) {
                    dp[i] = -1;
                }
            }
    
            if (dp[n] == -1) {
                dp[n] = fib(n - 1) + fib(n - 2);
            }
            return dp[n];
        }
    }
    
    
}
