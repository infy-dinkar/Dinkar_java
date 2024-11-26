package DSA_PROBLEMS;

public class First1inASortedBinaryArrayGfg {
    class Solution {

        public long firstIndex(int arr[]) {
            long idx=-1;
             int lo=0;
             int hi=arr.length-1;
             while(lo<=hi){
                 int mid=lo+(hi-lo)/2;
                 if(arr[mid]<1){
                     lo=mid+1;
                 }
                  if(arr[mid]==1){
                      idx=mid;
                      hi=mid-1;
                      
                  }
             }
             
             return idx;
        
        }
    }
    
}
