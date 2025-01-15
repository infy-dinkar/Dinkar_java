package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreePreOrderTraversalLeetcode144 {
    class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        if (root == null) return l;
        l.add(root.val);
        l.addAll(preorderTraversal(root.left)); 
        l.addAll(preorderTraversal(root.right)); 
        return l;
    }
}
    
}
