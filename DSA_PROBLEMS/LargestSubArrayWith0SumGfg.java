package DSA_PROBLEMS;

import java.util.HashMap;

public class LargestSubArrayWith0SumGfg {
    class Solution {
    int maxLen(int arr[]) {
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> hm =new HashMap<>();
         hm.put(0,-1);
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
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
