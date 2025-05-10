import java.util.ArrayList;
import java.util.Collections;

public class Leetcode2523 {
    class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ans = new int[2]; 
        ans[0] = -1;
        ans[1] = -1;
        
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] arr = new boolean[right + 1];
        
        for (int i = 0; i <= right; i++) {
            arr[i] = true;
        }
        
        arr[0] = false;
        arr[1] = false;
        
        for (int i = 2; i <= right; i++) {
            if (arr[i] == true) {
                if (i >= left && i <= right) {
                    list.add(i);
                }
                for (int j = 2; i * j <= right; j++) {
                    arr[i * j] = false;
                }
            }
        }
        
        if (list.size() < 2) {
            return ans;
        }
        
        Collections.sort(list);
        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int a = list.get(i);
            int b = list.get(i + 1);
            if (b - a < minDiff) {
                minDiff = b - a;
                ans[0] = a;
                ans[1] = b;
            }
        }
        
        return ans;
    }
}

    
}
