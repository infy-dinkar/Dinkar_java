import org.w3c.dom.Node;

public class DeleteInADoublyLinkedListGfg {
    class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null || x <= 0) return head;
        if (x == 1) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }
        Node current = head;
        for (int i = 1; i < x; i++) {
            current = current.next;
            if (current == null) return head;
        }
        if (current.next != null) current.next.prev = current.prev;
        if (current.prev != null) current.prev.next = current.next;
        return head;
    }
}

}
