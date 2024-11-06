package DSA_PROBLEMS;

public class AverageValueOfEvenNumberDivisibleBy3Leetcode {
    class Solution {
        public int averageValue(int[] nums) {
            int n = nums.length;
            int count = 0;
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                if (nums[i] % 6 == 0) {
                    count++;
                    sum += nums[i];
                }
            }
    
            if (count > 0) {
                return sum / count;
            } else {
                return 0;
            }
        }
    }
    
    
}
