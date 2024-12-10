package DSA_PROBLEMS;

import java.util.Stack;

public class ValidParenthesisLeetcode20 {
    class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        int N = s.length();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < N; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0) return false;
                else if (st.peek() == '(' && ch == ')') {
                    st.pop();
                } else if (st.peek() == '{' && ch == '}') {
                    st.pop();
                } else if (st.peek() == '[' && ch == ']') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.size()==0) return true;
        else return false;
    }
}

}
