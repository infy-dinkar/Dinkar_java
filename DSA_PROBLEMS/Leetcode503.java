import java.util.HashMap;
import java.util.Stack;

public class Leetcode503 {

    class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;
            if (st.size() == 0) {
                st.push(idx);
            } else {
                while (st.size() != 0 && nums[st.peek()] < nums[idx]) {
                    hm.put(st.pop(), nums[idx]);
                }
                st.push(idx);
            }
        }

        while (st.size() != 0) {
            int idx = st.pop();
            if (!hm.containsKey(idx)) {
                hm.put(idx, -1);
            }
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = hm.get(i);
        }

        return res;
    }
}
   
}
