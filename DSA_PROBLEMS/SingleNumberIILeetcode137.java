public class SingleNumberIILeetcode137 {
    class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int unique=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(((nums[j]>>i)&1)==1){
                    count++;
                }
            }

            if(count%3!=0){
                unique=unique|(1<<i);
            }
        }

        return unique;
        
    }
}
    
}
