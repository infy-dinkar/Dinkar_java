public class Pattern29 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            char count = (char) ('A' + i);
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    
}
