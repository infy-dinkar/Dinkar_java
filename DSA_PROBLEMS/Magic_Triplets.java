package DSA_PROBLEMS;

public class Magic_Triplets {
    public int countTriplets(int[] nums){
        int n=nums.length;
       
        int count_total=0;
        for(int i=1;i<=n-2;i++){
            
             int count_left=0;
             int count_right=0;
              
              for(int j=i-1;j>=0;j--){
                  if(nums[i]>nums[j]){
                      count_left++;
                  }
              }
              for(int k=i+1;k<=n-1;k++){
                  if(nums[k]>nums[i]){
                      count_right++;
                  }
              }
              count_total+=count_left*count_right;
        }
        
         return count_total;
    }
    
}
