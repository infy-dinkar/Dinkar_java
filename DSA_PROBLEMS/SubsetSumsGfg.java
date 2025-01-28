package DSA_PROBLEMS;

import java.util.ArrayList;

public class SubsetSumsGfg {
    class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        
        ArrayList<Integer> li=new ArrayList<>();
        int sum=0;
        subset(arr,0,arr.length,sum,li);
        return li;
        // code here
    }
    
    public static void subset(int [] arr,int i,int l ,int sum ,ArrayList<Integer> li){
        if(i==l){
            li.add(sum);
            return;
        }
        
        
    
    
    subset(arr,i+1,l,sum+arr[i],li);
    subset(arr,i+1,l,sum,li);
     return; 
        
    }
    
    
    
}
    
}
