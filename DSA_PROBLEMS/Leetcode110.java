public class Leetcode110 {
    class Solution {
    public boolean isBalanced(TreeNode root) {
        if (height(root) == -1) {
            return false;
        } else {
            return true;
        }
    }

    private int height(TreeNode root) {
        if (root == null) return 0;

        int l = height(root.left);
        if (l == -1) return -1;  

        int r = height(root.right);
        if (r == -1) return -1;  

        int d = Math.abs(l - r);
        
        if (d > 1) {
            return -1;  
        } else {
            return Math.max(l, r) + 1;
        }
    }
}

    
}
