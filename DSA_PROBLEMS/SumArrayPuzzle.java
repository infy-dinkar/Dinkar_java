package DSA_PROBLEMS;
 import java.util.ArrayList;

public class SumArrayPuzzle {
    
    

class Solution {
    public void sumArray(ArrayList<Integer> arr) {
        int n=arr.size();
        int sum=0;
        for(int i=0;i<=n-1;i++){
            sum+=arr.get(i);
            
        }
        
        for(int i=0;i<=n-1;i++){
            arr.set(i,sum-arr.get(i));
        }
        
    }
}


    
    
    
}
