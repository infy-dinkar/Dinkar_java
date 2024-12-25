import org.w3c.dom.Node;

public class CopyListWithRandomPointerLeetcode138 {
    class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node temp = head;
        while (temp != null) {
            Node nn = new Node(temp.val);
            nn.next = temp.next;
            temp.next = nn;
            temp = nn.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        Node newHead = head.next;
        Node temp1 = head;
        Node temp2 = newHead;

        while (temp1 != null) {
            temp1.next = temp1.next.next;
            if (temp2.next != null) {
                temp2.next = temp2.next.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return newHead;
    }
}

    
}
