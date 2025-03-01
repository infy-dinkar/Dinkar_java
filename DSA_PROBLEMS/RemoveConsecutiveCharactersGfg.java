public class RemoveConsecutiveCharactersGfg {
    class Solution {
        public String removeConsecutiveCharacter(String s) {
            StringBuilder result = new StringBuilder(); 
            int n = s.length();
    
            for (int i = 0; i < n; i++) {
                if (i == 0) { 
                    result.append(s.charAt(i));
                } else if (s.charAt(i) != s.charAt(i - 1)) { 
                    result.append(s.charAt(i));
                }
            }
            
            return result.toString(); 
        }
    }
    
    
    
    
}
