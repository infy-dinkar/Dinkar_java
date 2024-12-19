package DSA_PROBLEMS;

public class ReverseLinkedListLeetcode206 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode rh=null;
            while(head!=null){
                ListNode temp=head;
                head=head.next;
                temp.next=null;
                temp.next=rh;
                rh=temp;
            }
    
            return rh;
    
    
            
        }
    }
    
}
