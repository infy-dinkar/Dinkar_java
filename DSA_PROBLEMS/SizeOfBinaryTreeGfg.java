package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class SizeOfBinaryTreeGfg {
    class Solution {
    public static int getSize(Node node) {
        if(node==null) return 0;
        int l=getSize(node.left);
        int r=getSize(node.right);
        return l+r+1;
        
    }
}
    
}
