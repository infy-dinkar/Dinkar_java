package DSA_PROBLEMS;

public class Print1toNwithoutUsingLoopGfg {
    class Solution{
        static void printtillN(int N){
            if (N==0) return;
            printtillN(N-1);
            System.out.print(N+" ");
            
        }
    }
    
}
