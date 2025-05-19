public class PositionOfSetBitGfg {
    class Solution {
    static int findPosition(int n) {
        int count = 0;
        int idx = -1;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                count += 1;
                if (count > 1) {
                    return -1;
                }
                idx = i + 1;
            }
        }
        if (count == 1) {
            return idx;
        } else {
            return -1;
        }
    }
}

    
}
