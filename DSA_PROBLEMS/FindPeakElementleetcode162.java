package DSA_PROBLEMS;

public class FindPeakElementleetcode162 {

    class Solution {
        public int findPeakElement(int[] nums) {
            int n=nums.length;
            if(n==1) return 0;
            if(nums[0]>=nums[1]) return 0;
            if((nums[n-1]>=nums[n-2])) return n-1;
    
            int lo=1;
            int hi=n-2;
    
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
    
                if(nums[mid]>=nums[mid-1] && nums[mid]>=nums[mid+1]) return mid;
    
                if(nums[mid]<=nums[mid+1]){
                    lo=mid+1;
                }
    
                else{
                    hi=mid-1;
                }
            }
    
            return -1;
    
            
        }
    }
    
}
