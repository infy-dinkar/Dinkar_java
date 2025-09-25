import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leetcode113 {
    class Solution {
    public List<Integer> copy(List<Integer> arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            list.add(arr.get(i));
        }
        return list;
    }

    public void helper(TreeNode root, int target, List<Integer> arr, List<List<Integer>> ans) {
        if (root == null) return;

        arr.add(root.val);

        if (root.left == null && root.right == null) {
            if (root.val == target) {
                ans.add(copy(arr));
            }
            return;
        }

        List<Integer> arr1 = copy(arr);
        List<Integer> arr2 = copy(arr);

        helper(root.left, target - root.val, arr1, ans);
        helper(root.right, target - root.val, arr2, ans);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(root, targetSum, arr, ans);
        return ans;
    }
}

    
}
