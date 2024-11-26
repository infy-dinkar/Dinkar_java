package DSA_PROBLEMS;

public class SortedArraySearchGfg {
    class Solution {
        static boolean searchInSorted(int arr[], int k) {
            int lo=0;
            int hi=arr.length-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if(arr[mid]==k) return true;
                
                if( arr[mid]>k){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            
            return false;
        }
    }
    
}
