public class Leetcode1004 {
    class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count0 = 0;
        int max_len = 0;

        while (i < n && j < n) {
            if (nums[j] == 0) {
                count0++;
            }

            while (count0 > k) {
                if (nums[i] == 0) {
                    count0--;
                }
                i++;
            }

            int len = j - i + 1;
            if (len > max_len) {
                max_len = len;
            }

            j++;
        }

        return max_len;
    }
}

    
}
