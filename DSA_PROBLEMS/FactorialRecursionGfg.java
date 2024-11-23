package DSA_PROBLEMS;

public class FactorialRecursionGfg {
    class Solution {
        static int factorial(int n) {
            if(n==1) return 1;
            return n*factorial(n-1);
        }
    }
    
}
