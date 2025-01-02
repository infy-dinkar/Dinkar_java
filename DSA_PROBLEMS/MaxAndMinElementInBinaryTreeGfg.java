package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class MaxAndMinElementInBinaryTreeGfg {
    class Solution{
    public static int findMax(Node root){
        if(root ==null){
            return Integer.MIN_VALUE;
        }
        int l=findMax(root.left);
        int r=findMax(root.right);
        return Math.max(l,Math.max(r,root.data));
    }
    public static int findMin(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int l=findMin(root.left);
        int r=findMin(root.right);
        return Math.min(l,Math.min(r,root.data));
        //code here
    }
}
    
}
