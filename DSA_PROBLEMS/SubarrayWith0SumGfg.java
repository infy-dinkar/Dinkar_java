package DSA_PROBLEMS;

import java.util.HashSet;

public class SubarrayWith0SumGfg {
   class Solution {
    static boolean findsum(int arr[]) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(0);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hs.contains(sum)){
                return true;
            }
            
            else{
                hs.add(sum);
            }
        }
        
        return false;
    }
} 
    
}
