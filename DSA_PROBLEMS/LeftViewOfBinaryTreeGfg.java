package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class LeftViewOfBinaryTreeGfg {
    class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
         ArrayList<Integer> list=new ArrayList<>();
         if(root==null) return list;
         Queue <Node>q=new LinkedList<>();
         q.add(root);
         while(q.size()>0){
             int n=q.size();
             for(int i=0;i<n;i++){
             Node temp=q.poll();
             if(i==0){
             list.add(temp.data);
             }
             
             
             if(temp.left!=null){
                 q.add(temp.left);
             }
             
             if(temp.right!=null){
                 q.add(temp.right);
             }
         }
         }
         
         return list;
         
         
    
    }
}
    
}
