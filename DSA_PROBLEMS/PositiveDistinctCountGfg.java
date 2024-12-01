package DSA_PROBLEMS;

import java.util.HashSet;

public class PositiveDistinctCountGfg {
    class Solution {
    public int distinctCount(int[] arr) {
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                hs.add(arr[i]);
            }
        }
        
        return hs.size();
    }
}
    
}
