import java.util.ArrayList;
import java.util.List;

public class Leetcode2761 {
    class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] arr = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i <= n; i++) {
            if (arr[i] == true) {
                list.add(i);
                for (int j = 2; i * j <= n; j++) {
                    arr[i * j] = false;
                }
            }
        }

        int l = list.size();

        List<List<Integer>> ans = new ArrayList<>();
        int left = 0;
        int right = l - 1;

        while (left <= right) {
            int sum = list.get(left) + list.get(right);

            if (sum == n) {
                List<Integer> pair = new ArrayList<>();
                pair.add(list.get(left));
                pair.add(list.get(right));
                ans.add(pair);
                left++;
                right--;
            } else if (sum < n) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}

}
