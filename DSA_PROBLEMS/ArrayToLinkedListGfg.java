package DSA_PROBLEMS;

import org.w3c.dom.Node;

public class ArrayToLinkedListGfg {
    class Solution {
    static Node constructLL(int arr[]) {
        int n=arr.length;
        if (n==0){
            return null;
        }
        
        Node head=new Node(arr[0]);
        Node temp=head;
        
        for(int i=1;i<n;i++){
            temp.next=  new Node(arr[i]);
            temp=temp.next;
        }
        
        return head;
        
    }
}
    
}
