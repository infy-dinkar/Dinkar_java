public class IntersectionOfTwoLinkedListLeetcode160 {

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;
    
            ListNode temp1 = headA;
            ListNode temp2 = headB;
            int count_A = 1, count_B = 1;
    
            while (temp1 != null && temp1.next != null) {
                temp1 = temp1.next;
                count_A++;
            }
    
            while (temp2 != null && temp2.next != null) {
                temp2 = temp2.next;
                count_B++;
            }
    
            temp1 = headA;
            temp2 = headB;
    
            if (count_A > count_B) {
                for (int i = 0; i < count_A - count_B; i++) {
                    temp1 = temp1.next;
                }
            } else {
                for (int i = 0; i < count_B - count_A; i++) {
                    temp2 = temp2.next;
                }
            }
    
            while (temp1 != null && temp2 != null) {
                if (temp1 == temp2) return temp1;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
    
            return null;
        }
    }
    
    
}
