package DSA_PROBLEMS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreeZigZagTraversalLeetcode103 {
    class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        if (root == null) {
            return listOfLists;
        }

        int level = 1;
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.addFirst(root);

        while (!dq.isEmpty()) {
            int n = dq.size();
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (level % 2 == 0) {
                    TreeNode temp = dq.pollLast();
                    list.add(temp.val);

                    if (temp.right != null) {
                        dq.addFirst(temp.right);
                    }
                    if (temp.left != null) {
                        dq.addFirst(temp.left);
                    }
                } else {
                    TreeNode temp = dq.pollFirst();
                    list.add(temp.val);

                    if (temp.left != null) {
                        dq.addLast(temp.left);
                    }
                    if (temp.right != null) {
                        dq.addLast(temp.right);
                    }
                }
            }

            listOfLists.add(list);
            level++;
        }

        return listOfLists;
    }
}

    
    
}
