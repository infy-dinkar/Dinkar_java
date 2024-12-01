package DSA_PROBLEMS;

import java.util.HashSet;

public class ContainsDuplicateLeetcode217 {

    class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);

        }

        if (nums.length==hs.size()){
            return false;
        }

        return true;
        
    }
}
    
}
