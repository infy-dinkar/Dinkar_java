package DSA_PROBLEMS;

public class AlternatesInAnArrayGFG {

    class Solution {
        public static void print(int arr[]) {
            int n=arr.length;
            for(int i=0;i<=n-1;i+=2){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
