import java.util.PriorityQueue;

public class MinimumCostOfRopesGfg {
    class Solution {
    
    public int minCost(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i=0;i<arr.length;i++){
             pq.add(arr[i]);
         }
         
         int ans=0;
         
         while(pq.size()>1){
             int val1=pq.peek();
             pq.poll();
             
             int val2=pq.peek();
             pq.poll();
             
             ans+=(val1+val2);
             
             pq.add(val1+val2);
             
         }
         
         return ans;
    }
}
    
}
