import javax.swing.tree.TreeNode;

public class CountTargetSumNotes {
    class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int left=pathSum( root.left,  targetSum-root.val);
        int right=pathSum( root.right,  targetSum-root.val);
         if(root.val==targetSum){
            return left+right+1;
         }
         else{
            return left+right;
         }
        
    }
}
    
}
