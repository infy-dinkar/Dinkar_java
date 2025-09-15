public class Leetcode1935 {
    class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int n = words.length;
        int tl = words.length;

        for (int i = 0; i < n; i++) {
            String check = words[i];

            for (int j = 0; j < brokenLetters.length(); j++) {
                if (check.indexOf(brokenLetters.charAt(j)) != -1) {
                    tl--;
                    break;
                }
            }
        }

        return tl;
    }
}

    
}
