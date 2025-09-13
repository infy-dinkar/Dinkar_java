import java.util.HashMap;

public class Leetcode3541 {
    class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(s.charAt(i)) == false) {
                hm.put(s.charAt(i), 1);
            } else {
                int f = hm.get(s.charAt(i));
                hm.put(s.charAt(i), f + 1);
            }
        }

        int max_frequency_vowel = 0;
        char[] arr = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < 5; i++) {
            int vf = hm.getOrDefault(arr[i], 0);
            if (vf > max_frequency_vowel) {
                max_frequency_vowel = vf;
            }
        }

        int max_frequency = 0;
        for (Character ch : hm.keySet()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                int cf = hm.get(ch);
                if (cf > max_frequency) {
                    max_frequency = cf;
                }
            }
        }

        return max_frequency + max_frequency_vowel;
    }
}

    
}
