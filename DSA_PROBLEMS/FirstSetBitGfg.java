public class FirstSetBitGfg {
    class Solution {
    public static int getFirstSetBit(int n) {
        for (int i = 1; i <= 32; i++) {
            if ((n & 1) != 0) {
                return i;
            }
            n = n >> 1;
        }
        return 0;
    }
}

    
}
