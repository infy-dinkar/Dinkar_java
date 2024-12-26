import org.w3c.dom.Node;

public class DoublyLinkedListInsertionAtGivenPositionGfg {
    class Solution {
    Node addNode(Node head, int p, int x) {
        Node newNode = new Node(x);
        Node current = head;
        int count = 0;
        while (count < p && current != null) {
            current = current.next;
            count++;
        }
        if (current != null) {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
        return head;
    }
}

    
}
