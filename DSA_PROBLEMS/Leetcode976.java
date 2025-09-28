public class Leetcode976 {
    

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = n - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        
        return 0;
    }

}

  /*
     * Largest Perimeter Triangle
     * 
     * Problem:
     * Given an array of positive integers, find three numbers that can form a triangle
     * with the largest possible perimeter. Return 0 if no triangle can be formed.
     *
     * Key Concept: Triangle Inequality Theorem
     * For any triangle with sides a, b, c:
     *   a + b > c
     *   a + c > b
     *   b + c > a
     * 
     * If we sort the array in ascending order (a <= b <= c), we only need to check:
     *   a + b > c
     * because the other two inequalities are automatically satisfied.
     *
     * Approach (Greedy):
     * 1. Sort the array in non-decreasing order.
     * 2. Start from the largest element and check triplets backwards.
     * 3. As soon as a triplet satisfies the triangle inequality, return its sum.
     *    This guarantees the largest perimeter because we are checking the largest sides first.
     * 4. If no triplet is found, return 0.
     *
     * Time Complexity: O(n log n) due to sorting
     * Space Complexity: O(1) if sorting in-place
     */  
    
}
