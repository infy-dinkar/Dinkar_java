public class Leetcode3000 {
    class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int row = dimensions.length;
        int col = dimensions[0].length;

        double max_diagonal = Double.MIN_VALUE;
        int max_area = Integer.MIN_VALUE;

        for(int i=0; i<row; i++) {
            int dl = 0;
            for(int j=0; j<col; j++) {
                dl += (dimensions[i][j] * dimensions[i][j]);
            }

            double dia_l = Math.sqrt(dl);
            int area = 1;
            for(int k=0; k<col; k++) {
                area *= dimensions[i][k];
            }

            if(dia_l > max_diagonal) {
                max_diagonal = dia_l;
                max_area = area;
            } else if(dia_l == max_diagonal) {
                if(area > max_area) {
                    max_area = area;
                }
            }
        }

        return max_area;
    }
}

    
}
