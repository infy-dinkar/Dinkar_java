package DSA_PROBLEMS;

import java.util.HashSet;

public class FindDistinctElementsInArrayGfg {
    static int distinct(int arr[]) {
    HashSet<Integer> hs= new HashSet<>();
    
    for(int i=0;i<arr.length;i++){
        hs.add(arr[i]);
    }
    
    return hs.size();
}
    
}
