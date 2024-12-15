package DSA_PROBLEMS;

import java.util.Stack;

public class Leetcode1047 {
    class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character>  st =new Stack<Character>();
        for(int i=n-1;i>=0;i--){
            char ch =s.charAt(i);
            if(st.size()==0){
                st.push(ch);
                
            }

            else if(st.peek()!=ch){
                  st.push(ch);

            }
             else{
                st.pop();
             }
        }

        StringBuilder sb=new StringBuilder();
         while(st.size()>0){
            char ch=st.peek();
            sb.append(ch);
         }

         return sb.toString();
        
    }
}
    
}
