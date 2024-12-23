package DSA_PROBLEMS;

public class SearchInsertPositionLeetcode35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int lo = 0;
            int hi = nums.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
    
                if (nums[mid] == target) return mid;
    
                if (nums[mid] > target) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            return lo; 
        }
    }
    
}
