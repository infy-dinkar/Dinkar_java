import java.util.ArrayList;
import java.util.Stack;

import org.w3c.dom.Node;

public class IterativeInorderGfg {

    class Solution
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> l=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        Node current =root;
        
        while(current !=null || st.size()>0){
            
      
        
        
        while(current != null){
            st.push(current);
            current=current.left;
            
        }
        
       current=st.pop();
       l.add(current.data);
        
        current=current.right;
    }
    
       return l;
    
    }
    
 
    
}
