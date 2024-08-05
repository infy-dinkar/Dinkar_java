public class Pattern15 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print("*");

            }
            for(int k=1;k<=i-1;k++){
                System.out.print("_");

            }
            for(int k1=1;k1<i-1;k1++){
                System.out.print("_");

            }
            for(int j1=1;j1<=5-i+1;j1++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
    
}
