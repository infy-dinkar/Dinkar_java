import org.w3c.dom.Node;

public class CountNonLeafNodesGfg {
    class Solution
{
	int countNonLeafNodes(Node root) {
	    if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int l=countNonLeafNodes(root.left);
        int r=countNonLeafNodes(root.right);
        return l+r+1;
	}
}
    
}
