package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTreeRightSideViewLeetcode199 {
    class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(i==n-1){
                    list.add(temp.val);
                }

                if(temp.left!=null){
                    q.add(temp.left);
                }

                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }

        return list;
        
    }
}
    
}
