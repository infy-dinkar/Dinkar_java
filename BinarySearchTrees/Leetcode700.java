package BinarySearchTrees;

import javax.swing.tree.TreeNode;

public class Leetcode700 {
    class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;

        if (root.val == val) return root;

        if (root.val < val)
            return searchBST(root.right, val);

        if (root.val > val)
            return searchBST(root.left, val);

        return null;
    }
}

    
}
