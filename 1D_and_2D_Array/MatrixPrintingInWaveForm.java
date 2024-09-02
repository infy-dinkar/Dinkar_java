public class MatrixPrintingInWaveForm {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // Print the matrix in wave form
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Traverse left to right
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Traverse right to left
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
