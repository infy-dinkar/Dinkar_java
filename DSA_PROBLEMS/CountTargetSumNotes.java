import javax.swing.tree.TreeNode;

public class CountTargetSumNotes {
    class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int l=pathSum( root.left,  targetSum-root.val);
        int r=pathSum( root.right,  targetSum-root.val);
         if(root.val==targetSum){
            return l+r+1;
         }
         else{
            return l+r;
         }
        
    }
}
    
}
