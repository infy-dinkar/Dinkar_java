public class Pattern25 {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num1+" ");
                int temp=num1+num2;
                num1=num2;
                num2=temp;
            }
            System.out.println();
        }
    }
    
}
