public class Pattern17 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){

            for(int k=1 ; k<=5-i+1;k++){
                System.out.print( " ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
