public class Leetcode2535 {
    class Solution {
        public int differenceOfSum(int[] nums) {
            int n=nums.length;
            int sum1=0;
            int sum2=0;
            for(int i=0;i<n;i++){
                sum1+=nums[i];
            }
    
            for(int i=0;i<n;i++){
                String s=""+nums[i];
                if(s.length()>1){
                    while(nums[i]>0){
                        int x=nums[i]%10;
                        nums[i]=nums[i]/10;
                        sum2+=x;
                    }
                }
    
                else{
                    sum2+=nums[i];
                }
            }
    
            return Math.abs(sum1-sum2);
            
        }
    }
    
}
