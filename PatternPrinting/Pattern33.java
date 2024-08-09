public class Pattern33 {
    public static void main(String[] args) {
        int b=9;
        int c=1;
        for(int i=1;i<=5;i++){
            int a=i;
            for(int j=1;j<=5;j++){
                if(j%2==0){
                    System.out.print(a+" ");
                    a=a+c;
                }
                else{
                    System.out.print(a+" ");
                    a=a+b;
                }
            }
            b=b-2;
            c=c+2;
            System.out.println();

        }
        
    }
    
}
