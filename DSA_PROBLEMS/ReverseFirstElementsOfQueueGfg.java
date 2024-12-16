package DSA_PROBLEMS;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstElementsOfQueueGfg {
    class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        
        Stack<Integer> st=new Stack<Integer>();
        for(int i=1;i<=k;i++){
            int x=q.poll();
            st.push(x);
            
            
        }
        
        for(int i=1;i<=k;i++){
            int y=st.pop();
            q.add(y);
        }
        
        for(int i=1;i<=q.size()-k;i++){
            int z=q.poll();
            q.add(z);
            
        }
        
        return q;
        
        
        
    }
}
    
}
