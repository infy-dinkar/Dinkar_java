package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreePostOrderTraversalLeetcode145 {
    class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        
        list.addAll( postorderTraversal(root.left));
        
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);

        return list;
        
    }
}
        

    
}
