import javax.swing.tree.TreeNode;

public class Leetcode543 {
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
    public static int  levelcount(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levelcount(root.left),levelcount(root.right));
    }



    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int mydiameter=levelcount(root.left)+ levelcount(root.right);
        int ldia=diameterOfBinaryTree(root.left);
        int rdia=diameterOfBinaryTree(root.right);
        return Math.max(mydiameter,Math.max(ldia,rdia));
    }
}
    
}
