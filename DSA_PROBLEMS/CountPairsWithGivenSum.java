package DSA_PROBLEMS;

import java.util.Arrays;

public class CountPairsWithGivenSum {
    class Solution {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int ans = 0;
        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 < p2) {
            if (arr[p1] + arr[p2] > target) {
                p2--;
            } else if (arr[p1] + arr[p2] < target) {
                p1++;
            } else {
                if (arr[p1] != arr[p2]) {
                    int t1 = arr[p1], cl = 0;
                    while (p1 <= p2 && arr[p1] == t1) {
                        cl++;
                        p1++;
                    }
                    int t2 = arr[p2], cr = 0;
                    while (p1 <= p2 && arr[p2] == t2) {
                        cr++;
                        p2--;
                    }
                    ans += cl * cr;
                } else {
                    int count = p2 - p1 + 1;
                    ans += (count * (count - 1)) / 2;
                    break;
                }
            }
        }

        return ans;
    }
}
    
}
