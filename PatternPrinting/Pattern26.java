public class Pattern26 {
    public static void main(String[] args) {
        char count='A';
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=5-i+1;j++){
                System.out.print(count);
            }
            count++;
            System.out.println();
        }
    }
    
}
