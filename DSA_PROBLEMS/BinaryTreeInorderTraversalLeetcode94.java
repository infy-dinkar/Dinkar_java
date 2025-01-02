package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreeInorderTraversalLeetcode94 {
    class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        if(root==null) return l;
        
        l.addAll( inorderTraversal(root.left));
        l.add(root.val);
        l.addAll(inorderTraversal(root.right));

        return l;
        
    }
}
    
}
