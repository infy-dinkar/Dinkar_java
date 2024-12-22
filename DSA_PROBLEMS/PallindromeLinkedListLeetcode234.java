public class PallindromeLinkedListLeetcode234 {
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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rh = slow;
        ListNode rh1 = null;

        while (rh != null) {
            ListNode temp = rh.next;
            rh.next = rh1;
            rh1 = rh;
            rh = temp;
        }

        while (rh1 != null) {
            if (rh1.val != head.val) {
                return false;
            }
            rh1 = rh1.next;
            head = head.next;
        }

        return true;
    }
}

    
}
