package DSA_PROBLEMS;
import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Optimizing_Using_Arrayprefix_codechef {


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int[] arr=new int [n];
     for(int i=0;i<=n-1;i++){
          arr[i]=scan.nextInt();
     }
     
     long[] prefix_sum=new long[n];
     long sum=0;
     for(int k=0;k<=n-1;k++){
         sum+=arr[k];
         prefix_sum[k]=sum;
         
     }
     
     int K=scan.nextInt();
     for(int i=0;i<=K-1;i++){
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        if (n1==1){
            System.out.println(prefix_sum[n2-1]);
            
        }
        else{
             System.out.println(prefix_sum[n2-1]-prefix_sum[n1-2]);
            
        }
        
         
     }

	}
}

    
}
