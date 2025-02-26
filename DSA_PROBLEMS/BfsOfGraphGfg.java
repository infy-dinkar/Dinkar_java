import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsOfGraphGfg {

    class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V]; 
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0); 
        vis[0] = true; 
        
        while (!q.isEmpty()) {
            int u = q.poll(); 
            bfs.add(u);
            
            for (int v : adj.get(u)) {
                if (!vis[v]) {
                    q.add(v);
                    vis[v] = true;
                }
            }
        }
        return bfs;
    }
}
    
}
