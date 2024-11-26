package DSA_PROBLEMS;

public class FloorInSortedArrayGfg {
    static int findFloor(int[] arr, int k) {
        int lo=0;
        int hi=arr.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
             if(arr[mid]==k) return mid;
             if( arr[mid]<k){
                 ans=mid;
                 lo=mid+1;
             }
             else{
                 hi=mid-1;
             }
            
            
        }
        return ans;
    
    }
}
    

