package DSA_PROBLEMS;

import java.util.Arrays;

public class KDiffPairsInAnArrayLeetcode532 {
    class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int p1 = 0;
        int p2 = 1;
        int count = 0;

        while (p2 < nums.length) {
            if (p1 == p2 || nums[p2] - nums[p1] < k) {
                p2++;
            } else if (nums[p2] - nums[p1] > k) {
                p1++;
            } else {
                count++;
                p1++;
                p2++;
                while (p2 < nums.length && nums[p2] == nums[p2 - 1]) {
                    p2++;
                }
            }
        }
        return count;
    }
}

    
}
