public class MaximumValueOfExpression {
    class Solution {
        // Function to find the maximum value of the given expression.
        public int maxValueOfExpression(int[] arr) {
            int n = arr.length;
            
            int max1 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                int val = arr[i] + i;
                max1 = Math.max(max1, val);
                min1 = Math.min(min1, val);
            }
            int case1 = max1 - min1;
            
            int max2 = Integer.MIN_VALUE;
            int min2 = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                int val = arr[i] - i;
                max2 = Math.max(max2, val);
                min2 = Math.min(min2, val);
            }
            int case2 = max2 - min2;
            
            return Math.max(case1, case2);
        }
    }
    
    
}
