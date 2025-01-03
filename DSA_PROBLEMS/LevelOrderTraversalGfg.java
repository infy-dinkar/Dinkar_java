package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class LevelOrderTraversalGfg {
    class Solution {
    // Function to return the level order traversal of a tree.
    static ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> al=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(q.size()>0){
            Node temp=q.poll();
            al.add(temp.data);
            
            if(temp.left!=null){
                q.add(temp.left);
            }
            
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        
        return al;
        
    
    }
}
    
}
