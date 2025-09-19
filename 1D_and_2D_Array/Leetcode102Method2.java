import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leetcode102Method2 {
    class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void lot(TreeNode root, int level, int n, List<Integer> l) { 
        // lot =level order traversal
        if (root == null) return;
        if (level == n) {
            l.add(root.val);
        }
        lot(root.left, level + 1, n, l);
        lot(root.right, level + 1, n, l);
    }

    public int levels(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        int n = levels(root);
        for (int i = 1; i <= n; i++) {
            List<Integer> l = new ArrayList<>();
            lot(root, 1, i, l);
            ans.add(l);
        }
        return ans;
    }
}

    
}
