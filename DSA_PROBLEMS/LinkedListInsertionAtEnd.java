package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class LinkedListInsertionAtEnd {
    class Solution {
    Node insertAtEnd(Node head, int x) {
        Node nn = new Node(x);
        if (head == null) {
            return nn;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;
        return head;
    }
}
    
}
