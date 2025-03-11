public class UniqueBinarySearchTreeLeetcode96 {
    class Solution {
        public int numTrees(int n) {
            int [] dp=new int[n+1];
            dp[0]=1;
            for(int i=1;i<=n;i++){
                int sum=0;
                int j=0,k=i-1;
                while(k>=0){
                    sum+=dp[j]*dp[k];
                    j++;
                    k--;
                }
                dp[i]=sum;
            }
    
            return dp[n];
    
            
        }
    }
    
}
