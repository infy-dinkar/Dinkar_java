package Trees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}


public class NodeOfTree {
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(6);
        Node d=new Node(9);
        Node e= new Node(10);

        root.left=a;
        root.right=b;

        a.left=c;
        a.right=d;

        b.left=e;
        System.out.println(e.val);
        System.out.println(root.right.left.val);
        display(root);
        int x=sum(root);
        System.out.println(x);
        int z=product(root);
        System.out.println(z);
    }    

      public static void display(Node a){
        if(a==null){
            return;
        }
        System.out.print(a.val+" ");
        display(a.left);
        display(a.right);

      }

      public static int sum(Node a){
        if(a==null) return 0;
        return a.val+sum(a.left)+sum(a.right) ;

        
      }

      public static int product(Node a){
        if(a==null){
            return 1;
        }

        return ((a.val)*product(a.left)*product(a.right));
      }






        
    
    
}
