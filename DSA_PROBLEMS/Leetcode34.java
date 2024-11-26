package DSA_PROBLEMS;

public class Leetcode34 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] arr = new int[2];
            int lo = 0;
            int hi = nums.length - 1;
            int f = -1;
            int l = -1;
    
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums[mid] == target) {
                    f = mid;
                    hi = mid - 1;
                } else if (nums[mid] < target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
    
            lo = 0;
            hi = nums.length - 1;
    
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums[mid] == target) {
                    l = mid;
                    lo = mid + 1;
                } else if (nums[mid] < target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
    
            arr[0] = f;
            arr[1] = l;
    
            return arr;
        }
    }
    
    
}
