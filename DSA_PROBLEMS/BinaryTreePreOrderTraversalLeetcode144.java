package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreePreOrderTraversalLeetcode144 {
    class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.add(root.val);
        list.addAll(preorderTraversal(root.left)); 
        list.addAll(preorderTraversal(root.right)); 
        return list;
    }
}
    
}
