public class PrintFirstLetterOfStringGfg {
    class Solution {
        String firstAlphabet(String S) {
            String result = "";
            String[] words = S.split(" ");
            
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 0) {
                    result = result + words[i].charAt(0);
                }
            }
            
            return result;
        }
    }
        
    
}
