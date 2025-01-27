public class MergeTwoSortedListLeetcode21 {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;
    
            ListNode head;
            ListNode temp;
    
            if (list1.val < list2.val) {
                head = list1;
                temp = list1;
                list1 = list1.next;
            } else {
                head = list2;
                temp = list2;
                list2 = list2.next;
            }
    
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                } else {
                    temp.next = list2;
                    list2 = list2.next;
                }
                temp = temp.next;
            }
    
            if (list1 != null) {
                temp.next = list1;
            } else {
                temp.next = list2;
            }
    
            return head;
        }
    }
    
    
}
