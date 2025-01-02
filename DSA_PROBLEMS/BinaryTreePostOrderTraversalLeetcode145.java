package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreePostOrderTraversalLeetcode145 {
    class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        ArrayList<Integer> l=new ArrayList<>();
        if(root==null) return l;
        
        l.addAll( postorderTraversal(root.left));
        
        l.addAll(postorderTraversal(root.right));
        l.add(root.val);

        return l;
        
    }
}
        

    
}
