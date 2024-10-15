package DSA_PROBLEMS;

public class Product_Array_Puzzel_GFG {
    class Solution {
        public static long[] productExceptSelf(int nums[]) {
            int n = nums.length;
            if(n==1){
                long[] arr = new long[1];  
                 arr[0] = 1;                
                 return arr;
    
            }
            
            long product1 = 1;
            long[] prefix_product = new long[n];
            for (int i = 0; i <= n - 1; i++) {
                product1 *= nums[i];
                prefix_product[i] = product1;
            }
            
            long product2 = 1;
            long[] suffix_product = new long[n];
            for (int i = n - 1; i >= 0; i--) {
                product2 *= nums[i];
                suffix_product[i] = product2;
            }
            
            long[] ans = new long[n];
        
                ans[0] = suffix_product[1];
                ans[n - 1] = prefix_product[n - 2];
            for (int i = 1; i <= n - 2; i++) {
                ans[i] = prefix_product[i - 1] * suffix_product[i + 1];
            }
            
            return ans;
        }
    }
    
    
}
