import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode239TLE {
    class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = k - 1;
        while (i < n && j < n) {
            int kk = i;

            q.clear(); 

            while (kk <= j) {
                if (q.size() == 0) {
                    q.add(nums[kk]);
                }
                if (q.size() !=0 && q.peek() < nums[kk]) {
                    q.poll();
                    q.add(nums[kk]);
                }
                kk++;
            }

            ans.add(q.peek());
            i++;
            j++;
        }

        int[] res = new int[ans.size()];
        for (int idx = 0; idx < ans.size(); idx++) {
            res[idx] = ans.get(idx);
        }

        return res;
    }
}

    
}
