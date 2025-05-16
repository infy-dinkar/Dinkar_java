public class PowerOfTwoGfg {
    class Solution {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(int n) {
        if((n>0)&&((n&n-1)==0)){
            return true;
        }
        
        return false;
        
    }
}
}
