import java.util.HashMap;

public class MostFrequentCharacterGfg {
    class Solution {
    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int count = -1;
        char max_char = '\0';

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int char_count = hm.get(ch);
            if (char_count > count || (char_count == count && ch < max_char)) { 
                count = char_count;
                max_char = ch;
            }
        }

        return max_char;
    }
}
    
}
