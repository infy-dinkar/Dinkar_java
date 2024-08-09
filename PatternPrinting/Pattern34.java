
class Pattern34{
    public static void main(String[] args) {
        
        for(int i = 1; i <=6; i++){
            int a = i;
            for(int j = 1; j <= i; j++){
                System.out.print(a + " ");
                if(j % 2 != 0) a += 2 * 6 - 2 * i + 1;
                else a += 2 * (i - j);
            }
            System.out.println();
        }
    }
}