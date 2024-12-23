public class ReorderListLeetcode143 {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp2 = head;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rh1 = null;
        ListNode rh = slow;

    
        while (rh != null) {
            ListNode temp = rh; 
            rh = rh.next; 
            temp.next = rh1;
            rh1 = temp;
        }

        
        while (rh1 != null && rh1 != slow) { 
            ListNode temp3 = rh1; 
            rh1 = rh1.next; 

            temp3.next = head.next; 
            head.next = temp3; 

            head = temp3.next; 
        }
    }
}

    
}
