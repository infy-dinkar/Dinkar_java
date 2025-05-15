public class MaximumAndValueGfg {
    class Solution {
    public int findMaxAnd(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (((arr[j] >> i) & 1) == 1) {
                    count++;
                }
            }

            if (count >= 2) {
                ans = ans | (1 << i);

                for (int j = 0; j < n; j++) {
                    if (((arr[j] >> i) & 1) == 0) {
                        arr[j] = 0;
                    }
                }
            }
        }

        return ans;
    }
}

    
}
