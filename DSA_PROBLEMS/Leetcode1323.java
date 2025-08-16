public class Leetcode1323 {
    class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        int n = str.length();
        StringBuilder sb = new StringBuilder(str); 
        
        for(int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            if(ch == '6') {
                sb.setCharAt(i, '9');  
                break;
            }
        }

        return Integer.parseInt(sb.toString());
    }
}

    
}
