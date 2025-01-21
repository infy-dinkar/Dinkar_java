package DSA_PROBLEMS;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElementInterviewBit {
    public class Solution {
    public int[] solve(int[] A, int B) {
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            maxpq.add(A[i]);
        }
        int[] result = new int[B];
        for (int i = 0; i < B; i++) {
            result[i] = maxpq.poll();
        }
        return result;
    }
}
    
}
