package DSA_PROBLEMS;

public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                temp=arr[j][i];

            }
        }

    }
    
}
