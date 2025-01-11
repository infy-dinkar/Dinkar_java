package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class SumOfLeafNodesGfg {
    class Solution {
    static int leafSum(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.data;
        int l = leafSum(root.left);
        int r = leafSum(root.right);
        return l + r;
    }
}

}
