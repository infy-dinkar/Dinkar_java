public class BinarySearchTreesGfg {
    class Solution {
        static boolean isBSTTraversal(int arr[]) {
            
           int n=arr.length;
           int count=0;
           for(int i=0;i<n-1;i++){
               if(arr[i]>=arr[i+1]){
                   count++;
                   
                   
               }
           }
           
         if(count==0) return true;
         else return false;
        }
    }
}
