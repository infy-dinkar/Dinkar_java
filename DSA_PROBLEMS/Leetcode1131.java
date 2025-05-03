public class Leetcode1131 {
    class Solution {
        public int maxAbsValExpr(int[] arr1, int[] arr2) {
            int n = arr1.length;
            
            // Case 1: +arr1[i] + arr2[i] + i
            int max1 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int val = arr1[i] + arr2[i] + i;
                max1 = Math.max(max1, val);
                min1 = Math.min(min1, val);
            }
            int case1 = max1 - min1;
            
            // Case 2: +arr1[i] + arr2[i] - i
            int max2 = Integer.MIN_VALUE;
            int min2 = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int val = arr1[i] + arr2[i] - i;
                max2 = Math.max(max2, val);
                min2 = Math.min(min2, val);
            }
            int case2 = max2 - min2;
            
            // Case 3: +arr1[i] - arr2[i] + i
            int max3 = Integer.MIN_VALUE;
            int min3 = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int val = arr1[i] - arr2[i] + i;
                max3 = Math.max(max3, val);
                min3 = Math.min(min3, val);
            }
            int case3 = max3 - min3;
            
            // Case 4: +arr1[i] - arr2[i] - i
            int max4 = Integer.MIN_VALUE;
            int min4 = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int val = arr1[i] - arr2[i] - i;
                max4 = Math.max(max4, val);
                min4 = Math.min(min4, val);
            }
            int case4 = max4 - min4;
            
            return Math.max(Math.max(case1, case2), Math.max(case3, case4));
        }
    }
    
    
}
