public class WaveArray {

    class Solution {
        public static void convertToWave(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n - 1; i++) {
                if(i % 2 == 0 && arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                } else if(i % 2 != 0 && arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    
    
}
