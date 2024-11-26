package DSA_PROBLEMS;

public class leetcode50Pow {
    class Solution {
        public double myPow(double x, int n) {
            if (n == 0) return 1;
    
            double ans = myPow(x, n / 2);
    
            if(n>0){
                if(n%2==0){
                    return ans*ans;
                }
                else{
                    return ans*ans*x;
                }
            }
    
            else{
                if(n%2==0){
                    return 1/(ans*ans);
                }
                else{
                    return 1/(1/(ans*ans*x));
                }
    
            }
        }
    }
           
           
    
}
