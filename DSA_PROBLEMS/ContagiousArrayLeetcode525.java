package DSA_PROBLEMS;

import java.util.HashMap;

public class ContagiousArrayLeetcode525 {
    class Solution {
    public int findMaxLength(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }

        int sum=0;
        int ans=0;

        HashMap<Integer,Integer> hm= new HashMap<>();

        hm.put(0,-1);

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hm.containsKey(sum)){
                int l=i-hm.get(sum);
                ans=Math.max(ans,l);
            }

            else{
                hm.put(sum,i);
            }
        }


        return ans;


        
    }
}
    
}
