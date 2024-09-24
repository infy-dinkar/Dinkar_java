package LinkedList;
class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}

public class NodeList {
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a.value);
        System.out.println(a.next.value);
        System.out.println(a.next.next.value);
        System.out.println(a.next.next.next.value);
        System.out.println(a.next.next.next.next.value);

        
    }
    
}
