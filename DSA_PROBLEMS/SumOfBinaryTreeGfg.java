package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class SumOfBinaryTreeGfg {
    class Solution {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        if(root==null) return 0;
        
        
        int l=sumBT(root.left);
        int r=sumBT(root.right);
        return l+r+root.data;
    
    }
}
    
}
