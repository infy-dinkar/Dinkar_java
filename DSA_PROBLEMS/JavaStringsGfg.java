public class JavaStringsGfg {
    class Solution {
        static String conRevstr(String S1, String S2) {
            
            String combined = S1 + S2;
    
             
            String reversed = "";
            for (int i = combined.length() - 1; i >= 0; i--) {
                reversed += combined.charAt(i); // Append each character in reverse order
            }
    
            
            return reversed;
        }
    
}
}
