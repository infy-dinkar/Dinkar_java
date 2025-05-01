package DSA_PROBLEMS;

public class leetcode169 {
    class Solution {
        public int majorityElement(int[] nums) {
            int n = nums.length;
            int element = nums[0];
            int f = 1;
            
            for (int i = 1; i < n; i++) {
                if (f == 0) {
                    element = nums[i];
                    f = 1;
                }
                else if (element == nums[i]) {
                    f++;
                }
                else {
                    f--;
                }
            }
            
            return element;
        }
    }
    
    
}
