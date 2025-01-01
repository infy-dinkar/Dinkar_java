package DSA_PROBLEMS;

public class MergeSortGfg {
    class Solution {

        void mergeSort(int arr[], int l, int r) {
            if (l == r) return;
    
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    
        void merge(int arr[], int l, int m, int r) {
            int[] temp = new int[r - l + 1];
            int i = l;
            int j = m + 1;
            int k = 0;
    
            while (i <= m && j <= r) {
                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    k++;
                    i++;
                } else {
                    temp[k] = arr[j];
                    k++;
                    j++;
                }
            }
    
            while (i <= m) {
                temp[k] = arr[i];
                k++;
                i++;
            }
    
            while (j <= r) {
                temp[k] = arr[j];
                k++;
                j++;
            }
    
            for (k = 0; k < temp.length; k++) {
                arr[l + k] = temp[k];
            }
        }
    }
    
    
}
