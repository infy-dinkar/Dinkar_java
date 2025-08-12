import java.util.HashMap;
import java.util.Stack;

public class Leetocde496 {
    class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (st.size() == 0) {
                st.push(nums2[i]);
            } else {
                if (st.peek() < nums2[i]) {
                    while (st.size() != 0 && st.peek() < nums2[i]) {
                        hm.put(st.pop(), nums2[i]);
                    }
                }
                st.push(nums2[i]);
            }
        }

        while (st.size() != 0) {
            hm.put(st.pop(), -1);
        }

        int[] ans = new int[nums1.length];
        for (int j = 0; j < nums1.length; j++) {
            ans[j] = hm.get(nums1[j]);
        }

        return ans;
    }
}

    
}
