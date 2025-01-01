package DSA_PROBLEMS;

public class ReverseLinkedListLeetcode206 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode reverseHead=null;
            while(head!=null){
                ListNode temp=head;
                head=head.next;
                temp.next=null;
                temp.next=reverseHead;
                reverseHead=temp;
            }
    
            return reverseHead;
    
    
            
        }
    }
    
}
