public class Leetcode2894 {
    class Solution {
        public int differenceOfSums(int n, int m) {
            int sum_divisible=0;
            int sum_non_divisible=0;
            for(int i=1;i<=n;i++){
                if(i%m==0){
                    sum_divisible+=i;
                }
                else{
                    sum_non_divisible+=i;
                }
            }
    
            return sum_non_divisible-sum_divisible;
            
        }
    }
}
