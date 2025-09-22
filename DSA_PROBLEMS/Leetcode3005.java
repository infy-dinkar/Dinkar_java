public class Leetcode3005 {
    class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        int maxFreq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                count += freq[i];
            }
        }
        return count;
    }
}

    
}
