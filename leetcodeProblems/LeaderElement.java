package leetcodeProblems;

public class LeaderElement {
    public static void main(String[] args) {
        int [] arr={3,4,2,15,8,7,4,5,0,6};
         int count =1;
         
         int n=arr.length;
         for(int i=1;i<=n-1;i++){
            boolean is_max=true;
            for(int j=i-1;j>=0;j--){
                if (arr[j]>arr[i]) {
                    is_max=false;
                    break;
                }
            }
            if(is_max){
            count=count+1;
            }
         }
         System.out.println(count);
    }
    
}
