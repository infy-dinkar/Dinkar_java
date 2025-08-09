public class Leetcode713 {
    class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int n = nums.length;
        int count = 0;
        int i = 0;
        int j = 0;
        int product = 1;

        while (j < n && product * nums[j] < k) {
            product *= nums[j];
            j++;
        }
        j--;

        while (i < n && j < n) {
            if (product < k && j >= i) {
                count += (j - i + 1);
            }
            product /= nums[i];
            i++;
            j++;
            while (j < n && product * nums[j] < k) {
                product *= nums[j];
                j++;
            }
            j--;
        }

        return count;
    }
}

    
}
