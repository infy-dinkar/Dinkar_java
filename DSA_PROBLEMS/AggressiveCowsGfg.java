package DSA_PROBLEMS;

import java.util.Arrays;

public class AggressiveCowsGfg {
    class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int lo = 1;
        int hi = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (check(stalls, k, mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return ans;
    }

    static boolean check(int[] stalls, int cows, int mid) {
        int lastPlacedCow = stalls[0];
        int count = 1;

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlacedCow >= mid) {
                count++;
                lastPlacedCow = stalls[i];
            }

            if (count == cows) {
                return true;
            }
        }

        return false;
    }
}

    
}
