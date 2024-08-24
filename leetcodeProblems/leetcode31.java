package leetcodeProblems;

public class leetcode31 {
    class Solution {
        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int idx = -1;
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    idx = i;
                    break;
                }
            }
    
            if (idx == -1) {
                int i = 0;
                int j = n - 1;
                while (i < j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            } else {
                
                int i = idx + 1;
                int j = n - 1;
                while (i < j) {  
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
    
            
                for (i = idx + 1; i < n; i++) {
                    if (nums[i] > nums[idx]) {
                        int temp = nums[idx];
                        nums[idx] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }
    }
    
    
}
