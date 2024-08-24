public class Name {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i < n; i++) {
            // D
            for (int j = 0; j < n; j++) {
                if (j == 0 || (j == n - 2 && (i != 0 && i != n - 1)) || (i == 0 || i == n - 1) && j < n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            
            System.out.print("  ");

            // I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            
            System.out.print("  ");

            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            
            System.out.print("  ");

            //K
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == n/2|| i - j == n/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            //A
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) || (i == n / 2) || (j == 0 || j == n - 1) && i != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");

            //R
            for(int j=0;j<n;j++){
                if(j==0||(i==0&&j<n/2)||(i==n/2&&j<n/2)||(j==n/2&&(i>0&&i<n/2))||(i-j==n/2 && i>n/2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            
            System.out.println();
        }
    }
}
