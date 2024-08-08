public class Pattern30 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<5-i;j++){
                System.out.print(" ");
            }
            int x=i;
            for(int k=1;k<=i;k++){
                System.out.print(x);
                x--;
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
