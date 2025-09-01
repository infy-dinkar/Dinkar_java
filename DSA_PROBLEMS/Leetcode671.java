import javax.swing.tree.TreeNode;

public class Leetcode671 {
    class Solution {
    int min1 = Integer.MAX_VALUE;
    long min2 = Long.MAX_VALUE;  

    public int findSecondMinimumValue(TreeNode root) {
        Firstmax(root);
        Secondmax(root);

        if (min2 == Long.MAX_VALUE) {
            return -1;
        } else {
            return (int) min2;
        }
    }

    public int Firstmax(TreeNode a) {
        if (a == null) return min1;

        if (a.val < min1) {
            min1 = a.val;
        }

        Firstmax(a.left);
        Firstmax(a.right);

        return min1;
    }

    public long Secondmax(TreeNode b) {
        if (b == null) return min2;

        if (b.val > min1 && b.val < min2) {
            min2 = b.val;
        }

        Secondmax(b.left);
        Secondmax(b.right);

        return min2;
    }
}

    
}
