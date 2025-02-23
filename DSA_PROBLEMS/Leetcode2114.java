public class Leetcode2114 {
    class Solution {
        public int mostWordsFound(String[] sentences) {
            int n = sentences.length;
            int count1 = Integer.MIN_VALUE;
            
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < sentences[i].length(); j++) {
                    if (sentences[i].charAt(j) == ' ') {
                        count++;
                    }
                }
                if (count > count1) {
                    count1 = count;
                }
            }
            return count1 + 1; 
        }
    }
    
    
}
