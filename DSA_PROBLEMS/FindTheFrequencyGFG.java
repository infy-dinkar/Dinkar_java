package DSA_PROBLEMS;

import java.util.HashMap;

public class FindTheFrequencyGFG {
    class Solution {
    int findFrequency(int arr[], int x) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int v=hm.get(arr[i]);
                hm.put(arr[i],v+1);
            }
            
            else{
                hm.put(arr[i],1);
            }
        }
        
        int ans=hm.getOrDefault(x, 0);
        
        return ans;
    }
}
    
}
