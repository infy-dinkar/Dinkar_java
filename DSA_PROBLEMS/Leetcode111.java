import javax.swing.tree.TreeNode;

public class Leetcode111 {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int levels(TreeNode a) {
        if (a == null) return 0;

        
        if (a.left == null) return 1 + levels(a.right);

        
        if (a.right == null) return 1 + levels(a.left);

        
        return 1 + Math.min(levels(a.left), levels(a.right));
    }

    public int minDepth(TreeNode root) {
        return levels(root);
    }
}

    
}
