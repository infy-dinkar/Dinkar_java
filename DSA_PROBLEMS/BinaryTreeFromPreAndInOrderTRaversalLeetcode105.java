package DSA_PROBLEMS;

import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class BinaryTreeFromPreAndInOrderTRaversalLeetcode105 {
    class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return constructTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, indexMap);
    }

    private TreeNode constructTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> indexMap) {
        if (preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = indexMap.get(preorder[preStart]);
        int leftSubtreeSize = rootIndex - inStart;

        root.left = constructTree(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndex - 1, indexMap);
        root.right = constructTree(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndex + 1, inEnd, indexMap);

        return root;
    }
}

    
}
