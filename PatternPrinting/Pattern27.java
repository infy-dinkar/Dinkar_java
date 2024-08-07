public class Pattern27 {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            char count='A';
            for(int j=1;j<=5-i+1;j++){
                System.out.print(count+ " ");
                count++;

            }
            System.out.println();
        }
    }
    
}
