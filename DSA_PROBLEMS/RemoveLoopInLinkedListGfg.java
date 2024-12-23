import org.w3c.dom.Node;

public class RemoveLoopInLinkedListGfg {
    /*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node s1 = head;
                Node s2 = slow;

                while (s1 != s2) {
                    s1 = s1.next;
                    s2 = s2.next;
                }

                Node start=s1;
                Node last=start;
                while(last.next!=start){
                    last=last.next;
                    
                }
                last.next=null;
            }
        }


    }
}
    
}
