package DSA_PROBLEMS;

public class SqrtLeetcode69 {
    class Solution {
        public int mySqrt(int x) {
            if (x == 0) return 0;
            int ans = 1;
            int lo = 1;
            int hi = x;
            
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                
                long square = (long) mid * mid;
                
                if (square <= x) {
                    ans = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            
            return ans; 
        }
    }
    
    
}
