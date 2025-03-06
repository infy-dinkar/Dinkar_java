public class IsogramStringGfg {
    class Solution {
        // Function to check if a string is Isogram or not.
        static boolean isIsogram(String data) {
            HashSet<Character> set = new HashSet<>();
    
            for (int i = 0; i < data.length(); i++) {
                char ch = data.charAt(i);
                if (set.contains(ch)) {
                    return false; 
                }
                set.add(ch);
            }
    
            return true; 
        }
    
    
}
