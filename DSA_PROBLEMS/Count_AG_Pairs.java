package DSA_PROBLEMS;

public class Count_AG_Pairs {
    public static void main(String[] args) {
		char [] arr={'b','a','a','g','d','c','a','g'};
		int count_g=0;
		int ans=0;
		int n=arr.length;
		for(int i=n-1;i>=0;i--){
		    if (arr[i]=='g'){
		        count_g++;
		    }
		    
		    if(arr[i]=='a'){
		        ans+=count_g;
		    }
		}
		System.out.println(ans);
		
	}
    
}
