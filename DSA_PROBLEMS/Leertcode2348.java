public class Leertcode2348 {
    class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        long ans=0;
        long count=0;
        while(i<n){
            if(nums[i]!=0){
                ans+=(count*(count+1))/2;
                count = 0;
            }
            if(nums[i]==0){
                count++;
            }
            i++;
            
        }
        ans+=(count*(count+1))/2;

        return ans;
        
        
    }
}
    
}
