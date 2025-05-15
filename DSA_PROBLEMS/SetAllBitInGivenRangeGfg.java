public class SetAllBitInGivenRangeGfg {
    class Solution {
    static int setAllRangeBits(int N, int L, int R) {
        for(int i=L-1;i<R;i++){
            if(((N>>i)&1)!=1){
                N=N|(1<<i);
            }
        }
        
        return N;
        
    }
}
    
}
