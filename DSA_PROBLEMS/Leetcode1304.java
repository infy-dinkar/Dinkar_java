import java.util.ArrayList;
public class Leetcode1304 {

    

class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> l = new ArrayList<>();
        
        for (int i = 1; l.size() < n - 1; i++) {
            l.add(i);
            l.add(-i);
        }
        
        if (l.size() < n) {
            l.add(0);
        }
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = l.get(i);
        }
        
        return ans;
    }
}

    
}
