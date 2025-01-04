package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTreeLevelOrderTraversalLeetcode102 {
    class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ListOfList = new ArrayList<>();

        if (root == null) {
            return ListOfList; 
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (q.size()>0) {
            int n = q.size();
            List<Integer> newList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                newList.add(temp.val);

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }

            ListOfList.add(newList); 
        }

        return ListOfList;
    }
}

    
}
