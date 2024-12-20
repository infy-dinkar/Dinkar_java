package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class KthFromEndOfLinkedListGfg {
    class Solution {
    int getKthFromLast(Node head, int k) {
        Node temp = head;
        Node temp2 = head;
        int c = 0;

        while (temp.next != null) {
            temp = temp.next;
            c++;
        }

        if (k > c + 1) {
            return -1;
        } else {
            int k1 = c - k + 1;
            for (int i = 0; i < k1; i++) {
                temp2 = temp2.next;
            }
            return temp2.data;
        }
    }
}

    
}
