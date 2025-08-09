public class Leetcode209 {
    class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min_len=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int j=0;
        while(j<n && sum<target){
            sum+=nums[j];
            j++;
        }
        j--;

        while(i<n && j<n){
            int len=j-i+1;
            if(sum>=target){
                min_len=Math.min(min_len,len);
            }
            sum-=nums[i];
            i++;
            j++;

            while(j<n && sum<target){
                sum+=nums[j];
                j++;
            }
            j--;
        }

        if(min_len==Integer.MAX_VALUE){
            return 0;
        }
        return min_len;
        
    }
}
    
}
