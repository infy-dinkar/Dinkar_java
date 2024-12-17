package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class CountLinkedListNodesGfg {
    class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
            
        }
        return count;
    }
}
    
}
