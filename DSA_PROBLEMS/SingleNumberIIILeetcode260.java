public class SingleNumberIIILeetcode260 {
    class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int value=0;
        for(int i=0;i<n;i++){
            value=value^nums[i];
        }

        int index=0;
        for(int i=0;i<32;i++){
            if(((value>>i)&1)==1){
                index=i;
                break;
            }
        }
        int set=0;
        int unset=0;
        for(int i=0;i<n;i++){
            if(((nums[i]>>index)&1)==1){
                set^=nums[i];
            }
            else{
                unset^=nums[i];
            }
        }

        int[] ans=new int[2];
        if(set<unset){
            ans[0]=set;
            ans[1]=unset;
        }

        else{
            ans[0]=unset;
            ans[1]=set;
        }

        return ans;

        
    }
}
    
}
