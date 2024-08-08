public class Pattern31 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            int a=i;
            for(int j=2;j<=i;j++){
                System.out.print(a-1);
                a--;
            }
            System.out.println();
        }
    }
    
}
