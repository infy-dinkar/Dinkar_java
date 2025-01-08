package DSA_PROBLEMS;

import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class PathToGivenNodeInterviewBit {
    public class Solution {
    ArrayList<TreeNode> l;
    public int[] solve(TreeNode A, int B) {
        l=new ArrayList<>();
        check(A,B);
        
        int[] result = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            result[l.size() - 1 - i] = l.get(i).val; 
        }
        return result;
        
        
        
        
        
    }
    
    private boolean check(TreeNode A,int B){
        if(A==null) return false;
        if(A.val==B) {
            l.add(A);
            return true;
        }
        
        if(check(A.left,B)||check(A.right,B)){
            l.add(A);
            return true;
        }
        else{
            return false;
        }
    }
}

    
}
