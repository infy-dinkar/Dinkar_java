package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class IsLinkedLIstLengthEvenGfg {
    class Solution {
    public boolean isLengthEven(Node head) {
        Node temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        
        if(c%2==0){
            return true;
        }
        
        else{
            return false;
        }
    }
}

    
}
