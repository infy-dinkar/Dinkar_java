public class Leetcode3019 {
    class Solution {
        public int countKeyChanges(String s) {
            int n = s.length();
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i + 1))) {
                    count++;
                }
            }
            return count;
        }
    }
    
    
}
