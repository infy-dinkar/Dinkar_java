public class Leetcode1343 {

    class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n= arr.length;
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
            
        }

        int avg=sum/k;
        if(avg>=threshold){
            count++;
        }

        int i=1;
        int j=k;
        int avg2=0;
        while(j<=n-1){
            sum=sum-arr[i-1]+arr[j];
             avg2=sum/k;
            if(avg2>=threshold){
                count++;

            }

            i++;
            j++;
        }

        return count;
        
    }
}
    
}
