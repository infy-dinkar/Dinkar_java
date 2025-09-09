public class Leetcode1317 {
    class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int a = i;
            int b = n - i;
            
            if (noZero(a) && noZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{-1, -1};  
    }
    
    private boolean noZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return flase;
    }
}

    
}
