package DSA_PROBLEMS;

import java.util.List;

public class SwapKthElement {
    class Solution {
    public void swapKth(int k, List<Integer> arr) {
    int n = arr.size();
    int leftIndex = k - 1;
    int rightIndex = n - k;
    if (leftIndex >= 0 && rightIndex < n && leftIndex != rightIndex) {
        int temp = arr.get(leftIndex);
        arr.set(leftIndex, arr.get(rightIndex));
        arr.set(rightIndex, temp);
    
}

    }
}

    
}
