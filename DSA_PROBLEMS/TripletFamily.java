package DSA_PROBLEMS;

public class TripletFamily {
    
class Solution {
    public boolean findTriplet(int[] arr) {
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                
                if(arr[j]<arr[i]){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  
                }
            }
        }
        
        int flag=0;
        
        for(int i=0;i<=n-1;i++){
            
        if(i==n-2) break;
        
        if(arr[i]+arr[i+1]==arr[i+2]){
            flag=1;
        }
            
        }
        
        if(flag==1){
            return true;
        }
         else{
             return false;
         }
                    
            
                    
              
                
                
       
    }
}


    
}
