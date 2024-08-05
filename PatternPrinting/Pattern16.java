public class Pattern16 {
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
        for(int i=2;i<=5;i++){
            for(int j=2;j<=i;j++){
                System.out.print("*");

            }
            for(int k=2;k<=5-i;k++){
                System.out.print("_");

            }
            for(int k1=2;k1<=5-i;k1++){
                System.out.print("_");

            }
            for(int j1=2;j1<=i;j1++){
                System.out.print("*");

            }
            System.out.println();

        }
        
        
         
    }
    
}
