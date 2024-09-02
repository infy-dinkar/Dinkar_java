public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] brr = {
            {5, 6},
            {7, 8},
            {9, 10}
        };

        // Resultant matrix will be of size 3x2
        int[][] crr = new int[3][2];

        // Perform matrix multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                crr[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    crr[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }

        // Print the resulting matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
