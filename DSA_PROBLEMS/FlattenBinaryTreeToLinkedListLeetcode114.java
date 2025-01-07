package DSA_PROBLEMS;

import javax.swing.tree.TreeNode;

public class FlattenBinaryTreeToLinkedListLeetcode114 {
    class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;


        flatten(root.left);
        flatten(root.right);
        TreeNode rh=root.right;
        root.right=root.left;
        root.left=null;
        TreeNode temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.right=rh;

        
    }
}
    
}
