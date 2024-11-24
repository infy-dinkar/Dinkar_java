package DSA_PROBLEMS;

public class PowerOfNumbersGfg {
    class Solution {

        public static int reversenumber(int n,int reverse) {
            if (n == 0) return reverse;
             reverse = reverse * 10 + (n % 10);
             return reversenumber(n / 10, reverse);
    
        }
    
        public static int power(int n, int r) {
            if (r == 0) return 1;
            return power(n, r - 1) * n;
        }
    
        public int reverseExponentiation(int n) {
            int reverse = reversenumber(n,0); 
            return power(n,reverse); 
        }
    }
    
    
}
