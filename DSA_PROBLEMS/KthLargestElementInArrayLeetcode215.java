package DSA_PROBLEMS;

public class KthLargestElementInArrayLeetcode215 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            int ans = 0;
            int lo = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < lo) {
                    lo = nums[i];
                }
            }
    
            int hi = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > hi) {
                    hi = nums[i];
                }
            }
    
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                int count = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] >= mid) count++;
                }
    
                if (count >= k) {
                    ans = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
    
            return ans;
        }
    }
    
    
}
