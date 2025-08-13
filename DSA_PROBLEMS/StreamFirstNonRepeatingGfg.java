import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class StreamFirstNonRepeatingGfg {
    class Solution {
    public String FirstNonRepeating(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm= new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            q.add(ch);
            
            if(hm.containsKey(ch)){
                int f=hm.get(ch);
                hm.put(ch,f+1);
            }
            
            else{
                hm.put(ch,1);
            }
            
            while(q.size()>0 && hm.get(q.peek())>1){
                q.poll();
            }
            
            if(q.size()>0){
                res.append(q.peek());
            }
            
            else{
                res.append('#');
            }
        }
        
        return res.toString();
    
        
    }
}
    
}
