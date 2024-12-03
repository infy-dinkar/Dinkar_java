package DSA_PROBLEMS;

import java.util.Arrays;

public class TwoSumPairwithGivenSumGfg {

    class Solution {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int p1 = 0, p2 = arr.length - 1;
        while (p1 < p2) {
            int sum = arr[p1] + arr[p2];
            if (sum == target) return true;
            else if (sum > target) p2--;
            else p1++;
        }
        return false;
    }
}

    
}
