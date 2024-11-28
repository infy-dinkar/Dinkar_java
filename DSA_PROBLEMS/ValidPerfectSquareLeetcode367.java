package DSA_PROBLEMS;

public class ValidPerfectSquareLeetcode367 {

    class Solution {
        public boolean isPerfectSquare(int num) {
            
            
            int lo = 1;
            int hi = num;
            
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                
                long square = (long) mid * mid;
                
                if (square == num) {
                    return true;
                } 
    
                if(square<num){
                    lo=mid+1;
                }
                
                
                else {
                    hi = mid - 1;
                }
            }
            
            
             return false;
        }
    }
    
            
        
    
}
