package DSA_PROBLEMS;

import java.util.HashSet;

public class ArraySubsetGfg {
    class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        boolean flag =true;
        for(int i=0;i<b.length;i++){
            if(hs.contains(b[i])){
                flag=true;
            }
            
            else{
                flag=false;
                break;
            }
        
        }
        
        if(flag==true) return true;
        else return false;
        
    }
}

    
}
