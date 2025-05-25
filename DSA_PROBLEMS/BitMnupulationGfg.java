public class BitMnupulationGfg {

    // User function Template for Java
// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        int ithbit = 0;
        int locator = 1 << (i - 1);
        
        if ((locator & num) != 0) {
            ithbit = 1;
        } else {
            ithbit = 0;
        }

        int setIthBit = num | locator;

        int clearIthBit = 0;
        
        if ((locator & num) != 0) {
            clearIthBit = num & ~locator;
        } else {
            clearIthBit = num;
        }

        System.out.print(ithbit + " " + setIthBit + " " + clearIthBit);
    }
}

    
}
