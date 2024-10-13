package DSA_PROBLEMS;

public class Count_AGA_Pairs {
    public static void main(String[] args) {
		char [] arr={'b','a','a','g','d','c','a','g'};
		int total_a=0;
		int total_left_a=0;
		int total_right_a=0;
		int ans=0;
		int n=arr.length;
		for(int i=0;i<=n-1;i++){
		    if(arr[i]=='a'){
		        total_a++;
		    }
		}
		
		for(int i=0;i<=n-1;i++){
		    if(arr[i]=='a'){
		        total_left_a++;
		        total_right_a=total_a-total_left_a;
		    }
		    
		    if(arr[i]=='g'){
		        ans+=total_left_a*total_right_a;
		        
		    }
		}
		System.out.println(ans);
		
	}
    
}
