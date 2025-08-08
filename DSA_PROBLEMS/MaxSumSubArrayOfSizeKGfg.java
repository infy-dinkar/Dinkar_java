class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        
        int max_sum=sum;
        
        int i=1;
        int j=k;
        while(j<=n-1){
            sum=sum-arr[i-1]+arr[j];
            if(sum>max_sum){
                max_sum=sum;
            }
            i++;
            j++;
        }
        
        return max_sum;
            
        
        
    }
}