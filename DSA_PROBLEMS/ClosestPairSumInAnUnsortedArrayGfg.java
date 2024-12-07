package DSA_PROBLEMS;
import java.util.*;

public class ClosestPairSumInAnUnsortedArrayGfg {
    

class Solution {
    public List<Integer> closestPairSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int closestDifference = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();

        while (left < right) {
            int sum = arr[left] + arr[right];
            int currentDifference = Math.abs(target - sum);

            if (currentDifference < closestDifference) {
                closestDifference = currentDifference;
                result.clear();
                result.add(arr[left]);
                result.add(arr[right]);
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}

    
}
