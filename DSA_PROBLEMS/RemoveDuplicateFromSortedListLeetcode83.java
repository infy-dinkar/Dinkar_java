public class RemoveDuplicateFromSortedListLeetcode83 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
    
            if(head==null || head.next==null) return head;
             head.next= deleteDuplicates(head.next);
             if(head.val==head.next.val){
                return head.next;
             }
    
             else{
                return head;
             }
            
        }
    }
}
