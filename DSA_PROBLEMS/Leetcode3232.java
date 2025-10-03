public class Leetcode3232 {
    class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sum2=0;
        int sum1=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=10){
                sum2+=nums[i];
            }
            if(nums[i]<10){
                sum1+=nums[i];
            }

            
        }
        if(sum2>sum1){
                return true;
            }
            if(sum2<sum1){
                return true;
            }

            return false;

        
    }
}
    
}
