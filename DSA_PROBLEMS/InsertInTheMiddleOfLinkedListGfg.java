package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class InsertInTheMiddleOfLinkedListGfg {
    class Solution {
    public Node insertInMiddle(Node head, int x) {
        if (head == null) { 
            return new Node(x);
        }

        Node temp = head;
        int c = 0;

        
        while (temp != null) {
            temp = temp.next;
            c++;
        }

    
        Node temp2 = head;
        for (int i = 0; i < (c - 1) / 2; i++) {
            temp2 = temp2.next;
        }

    
        Node nn = new Node(x);

    
        nn.next = temp2.next;
        temp2.next = nn;

        return head;
    }
}

    
}
