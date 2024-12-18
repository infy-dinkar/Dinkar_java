package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class ModularNodeGfg {
    class Solution {
    public int modularNode(Node head, int k) {
        Node temp=head;
        int c=0;
        int ans=-1;
        while(temp!=null){
           
            c++;
            if(c%k==0){
                ans=temp.data;
                 
            }
            temp=temp.next;
        }
        
        return ans;
        
        
        
    }
}
    
}
