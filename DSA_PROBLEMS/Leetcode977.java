public class Leetcode977 {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n=nums.length;
            int[] ans= new int[n];
            for(int i=0;i<n;i++){
                nums[i]=nums[i]*nums[i];
    
            }
    
            Arrays.sort(nums);
            for(int i=0;i<n;i++){
                ans[i]=nums[i];
            }
    
            return ans;
    
            
        }
    }
    
}
