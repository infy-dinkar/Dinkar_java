import java.util.ArrayList;
import java.util.Collections;

public class Leetcode2785 {


class Solution {
    boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String sortVowels(String s) {
        ArrayList<Character> temp = new ArrayList<>();

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                temp.add(arr[i]);
            }
        }

        Collections.sort(temp);

        StringBuilder ans = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                ans.append(temp.get(j));
                j++;
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}

    
}
