package DSA_PROBLEMS;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightLeetcode1046 {
    class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++){
            maxpq.add(stones[i]);

        }

        while(maxpq.size()>1){
            int max1=maxpq.peek();
            maxpq.poll();

            int max2=maxpq.peek();
            maxpq.poll();
             if(max1!=max2){
               int val= Math.abs(max1-max2);
                maxpq.add(val);
             }

            
        }

        if(maxpq.size()>0){
            return maxpq.peek();
        }

        else return 0;

        
    }
}
    
}
