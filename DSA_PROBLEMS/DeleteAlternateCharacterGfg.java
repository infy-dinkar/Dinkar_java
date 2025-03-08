public class DeleteAlternateCharacterGfg {
    class Solution {
        static String delAlternate(String S) {
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < S.length(); i += 2) {  // Step of 2 to pick even indices
                result.append(S.charAt(i));
            }
            
            return result.toString();
        }
    }
    
    
}
