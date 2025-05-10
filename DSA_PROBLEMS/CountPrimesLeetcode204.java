public class CountPrimesLeetcode204 {

    class Solution {
        public int countPrimes(int n) {
            boolean[] arr = new boolean[n];
            int count = 0;
    
            for (int i = 0; i < n; i++) {
                arr[i] = true;
            }
    
            if (n > 0) arr[0] = false;
            if (n > 1) arr[1] = false;
    
            for (int i = 2; i < n; i++) {
                if (arr[i] == true) {
                    count++;
                    for (int j = 2; j * i < n; j++) {
                        arr[i * j] = false;
                    }
                }
            }
    
            return count;
        }
    }
    
    
}
