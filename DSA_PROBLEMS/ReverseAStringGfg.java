public class ReverseAStringGfg {
    class Solution {
        public static String reverseString(String s) {
            char[] arr = s.toCharArray(); // Convert String to a character array
            int i = 0;
            int j = arr.length - 1;
            while (i <= j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            return new String(arr); // Convert character array back to String
        }
    }
    
    
}
