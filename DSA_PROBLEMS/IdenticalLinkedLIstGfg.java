import org.w3c.dom.Node;

public class IdenticalLinkedLIstGfg {

    class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp3 = head1;
        Node temp4 = head2;

        int c1 = 0;
        int c2 = 0;

        while (temp1 != null) {
            c1++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            c2++;
            temp2 = temp2.next;
        }

        if (c1 != c2) {
            return false;
        }

        for (int i = 0; i < c1; i++) {
            if (temp3.data != temp4.data) {
                return false;
            }
            temp3 = temp3.next;
            temp4 = temp4.next;
        }

        return true;
    }
}

    
}
