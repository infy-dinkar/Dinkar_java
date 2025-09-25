package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

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
        int p=nonzeroproduct(root);
        System.out.println(p);
        int no_of_levels=levelcount(root);
        System.out.println(no_of_levels);
        bfsltor(root);
        System.out.println();
        nthlevel(root,1,2);
         System.out.println();
        for(int i=1;i<4;i++){ 
          // Here i<4 because we already know no of levels.
           nthlevel(root,1,i);
          //  this will make print level wise
           System.out.println(); 


        }

        bfslevelbylevel(root);
        boolean w=isBalanced(root);
        System.out.println(w);
       int diameterOfTree= diameter(root);
       System.out.println(diameterOfTree);


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

      public  static int productnz =1;
 
      public static int nonzeroproduct(Node a){
        if(a==null){
            return 1;
        }
        int l=nonzeroproduct(a.left);
        int r=nonzeroproduct(a.right);
        if(a.val!=0){
            productnz*=a.val;
        }
        return productnz;

      }
      
      public static   int levelcount(Node a){
        if(a==null) return 0;
        return 1+ Math.max(levelcount(a.left),levelcount(a.right));
      }

      public static void bfsltor(Node a){
        Queue<Node> q = new LinkedList<>();
        if(a!=null)q.add(a);
        while(q.size()!=0){
          Node x=q.poll();
          System.out.print(x.val+" ");
          if(x.left!=null){
            q.add(x.left);
          }
          if(x.right!=null){
            q.add(x.right);
          }
        }

      }

      public static void bfslevelbylevel(Node a){
        Queue<Node> q = new LinkedList<>();
        if(a!=null)q.add(a);
        while(q.size()!=0){
          
          int n=q.size();
          for(int i=1;i<=n;i++){
            Node x=q.poll();
            System.out.print(x.val+" ");
          if(x.left!=null){
            q.add(x.left);
          }
          if(x.right!=null){
            q.add(x.right);
          }

          }
           System.out.println();
          
        }

      }
      
       
      
      public static void nthlevel(Node a, int level,int n){
        // level=>0.
        //  And n=level which we want to print.
        if(a==null)return;
        if(level==n)System.out.print(a.val+" ");
        nthlevel(a.left, level+1,n);
        nthlevel(a.right, level+1,n);
       }

       public static boolean isBalanced(Node a){
        if(a==null)return true;
        // levelcount() is function to count level is created above.
        int diff=Math.abs(levelcount(a.left)-levelcount(a.right));
        if(diff>1) return false;
        boolean lst=isBalanced(a.left);
        if(lst==false)return false;
        boolean rst=isBalanced(a.right);
        if(rst==false) return false;
        return true;

       }

       public static int diameter(Node a){
        if (a==null) return 0;
        int dia=levelcount(a.left)+levelcount(a.right);
        int leftdia=diameter(a.left);
        int rightdia=diameter(a.right);
        return Math.max(dia,Math.max(leftdia,rightdia));
       }
         
       // Path sum code is starting from here.

       public static List<Integer> deepcopy(List<Integer> arr){
        List<Integer> list=new ArrayList<>();
        for(int ele:arr){
          list.add(ele);
        }
        return list;

       }

       public static void helperforpathsum(Node a,int target,List<Integer> arr,List<List<Integer>> ans){
        if(a==null) return;
        if(a.left==null && a.right==null){
          if(a.val==target){
            arr.add(a.val);
            ans.add(arr);
          }

        }
        arr.add(a.val);
        List<Integer> arr1=deepcopy(arr);
        List<Integer> arr2=deepcopy(arr);
        helperforpathsum(a.left, target-a.val, arr1, ans);
        helperforpathsum(a.right, target-a.val, arr2, ans);
      

       }

       public static List<List<Integer>> PathSum(Node a,int target){
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helperforpathsum(a,target,arr,ans);
        return ans;
       }

      //  pathsum code ending here.

      



      


    

  






        
    
    
}
