package DSA_PROBLEMS;

public class RowsWithMax1sGfg {
    class Solution {
        public int rowWithMax1s(int arr[][]) {
            int rows = arr.length;
            int cols = arr[0].length;
            int pt1 = 0;
            int pt2 = cols - 1;
            int ans = -1;
    
            while (pt1 < rows && pt2 >= 0) {
                if (arr[pt1][pt2] == 1) {
                    ans = pt1;
                    pt2--;
                } else {
                    pt1++;
                }
            }
    
            return ans;
        }
    }
    
    
}
