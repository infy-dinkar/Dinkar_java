import javax.swing.tree.TreeNode;

public class Leetcode236 {
    class Solution {

    public static boolean exist(TreeNode root, TreeNode a) {
        if (a == root) return true;
        if (root == null) return false;

        return exist(root.left, a) || exist(root.right, a);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root || q == root) return root;

        boolean lp = exist(root.left, p);
        boolean lq = exist(root.left, q);

        if (lp == true && lq == true) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (lp == false && lq == false) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            // if (lp == false && lq == true) return root;
            // if(lp==true && lq==false) return root;

             
            return root;
        }
    }
}


    
}
