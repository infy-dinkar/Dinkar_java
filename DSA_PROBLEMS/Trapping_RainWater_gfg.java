package DSA_PROBLEMS;

public class Trapping_RainWater_gfg {
    class Solution {

        // arr: input array
        // n: size of array
        // Function to find the trapped water between the blocks.
        static long trappingWater(int arr[]) {
            
            int n=arr.length;
            int[] prefix_max=new int[n];
            int max1=Integer.MIN_VALUE;
            for(int i=0;i<=n-1;i++){
                if(arr[i]>max1){
                    max1=arr[i];
                    
                }
                prefix_max[i]=max1;
                
            }
            
            int [] suffix_max=new int[n];
            int max2=Integer.MIN_VALUE;
            for(int i=n-1;i>=0;i--){
                if(arr[i]>max2){
                    max2=arr[i];
                   
                }
                 suffix_max[i]=max2;
                
            }
            
            
            long ans=0;
            for(int i=1;i<=n-2;i++){
                int left_max=prefix_max[i-1];
                int right_max=suffix_max[i+1];
                int level=Math.min(left_max,right_max);
                int water_collected=level-arr[i];
                if(water_collected>0){
                    ans+=water_collected;
                }
            }
            
            return ans;
            
        }
    }
    
    
}
