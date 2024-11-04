package DSA_PROBLEMS;

public class MaxValueAfterMRnageOperationGFG {
    

// User function Template for Java

class Solution {
    public int findMax(int n, int[] a, int[] b, int[] k) {
        
        long[] arr = new long[n];  
        
        
        for (int i = 0; i < a.length; i++) {
            int s = a[i];   
            int e = b[i];  
            int v = k[i];   
            
            
            arr[s] += v;
            
        
            if (e + 1 < n) {
                arr[e + 1] -= v;
            }
        }
        
        long sum = 0;
        long max_element = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];  
            if (sum > max_element) {
                max_element = sum;  
            }
        }
        
        return (int) max_element;
    }
}
    
}
