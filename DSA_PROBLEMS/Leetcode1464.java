package DSA_PROBLEMS;

import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode1464 {
    class Solution {
    public int maxProduct(int[] nums) {

        int n=nums.length;
         PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
         for(int i=0;i<n;i++){
            pq.add(nums[i]);
         }

         int max1=pq.peek();
         pq.poll();
         int max2=pq.peek();
         pq.poll();

         return (max1-1)*(max2-1);
        
    }
}
    
}
