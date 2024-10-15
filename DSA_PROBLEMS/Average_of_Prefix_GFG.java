package DSA_PROBLEMS;

import java.util.ArrayList;
public class Average_of_Prefix_GFG {
class Solution {

    public ArrayList<Integer> prefixAvg(ArrayList<Integer> arr) {
        
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;
        int average = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
            average = sum / (i + 1);
            ans.add(average);
        }
        
        return ans;
    }
}

    
}
