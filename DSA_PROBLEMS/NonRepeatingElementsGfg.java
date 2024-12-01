package DSA_PROBLEMS;

import java.util.HashMap;

public class NonRepeatingElementsGfg {
    class Solution {
    public int firstNonRepeating(int[] arr) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int v=hm.get(arr[i]);
                hm.put(arr[i],v+1);
            }
            
            else{
                hm.put(arr[i],1);
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i])==1) return arr[i];
        }
        
        return 0;
    }
}

    
}
