package DSA_PROBLEMS;

public class RowsWithMax1sGfg {
    class Solution {
        public int rowWithMax1s(int arr[][]) {
            int rows = arr.length;
            int cols = arr[0].length;
            int p1 = 0;
            int p2 = cols - 1;
            int ans = -1;
    
            while (p1 < rows && p2 >= 0) {
                if (arr[p1][p2] == 1) {
                    ans = p1;
                    p2--;
                } else {
                    p1++;
                }
            }
    
            return ans;
        }
    }
    
    
}
