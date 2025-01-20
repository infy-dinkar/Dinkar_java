package DSA_PROBLEMS;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class CheckForBSTGfg {
    class Solution {
    boolean isBST(Node root) {
        ArrayList<Node> l = new ArrayList<>();
        if (root == null) return true;

        inOrderTraversal(root, l);

        int flag = 1;
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i).data > l.get(i + 1).data) {
                flag = 0;
                break;
            }
        }

        return flag == 1;
    }

    private void inOrderTraversal(Node root, ArrayList<Node> l) {
        if (root == null) return;

        inOrderTraversal(root.left, l);
        l.add(root);
        inOrderTraversal(root.right, l);
    }
}

    
}
