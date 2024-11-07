package DSA_PROBLEMS;

public class MultiplyLeftAndRightArraySum {
    class Solution {
        public int multiply(int[] arr) {
            int n=arr.length;
            int sum_left_half=0;
            int sum_right_half=0;
            for(int i=0;i<=(n/2)-1;i++){
                sum_left_half+=arr[i];
            }
            
            for(int i=n/2;i<=n-1;i++){
                sum_right_half+=arr[i];
                 
                
            }
            
            return (sum_right_half*sum_left_half);
        }
    }
    
}
