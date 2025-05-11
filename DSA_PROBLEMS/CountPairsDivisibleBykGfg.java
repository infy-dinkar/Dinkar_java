import java.util.HashMap;

public class CountPairsDivisibleBykGfg {
    class Solution {
    public static long countKdivPairs(int arr[], int n, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        long pairs=0;  

        for(int i=0;i<n;i++){
            arr[i]=arr[i]%k;
        }

        for(int i=0;i<n;i++){
            int m=arr[i];
            int t=(k - m) % k; 

            if(hm.containsKey(t)){
                pairs += hm.get(t);
            }

            if(hm.containsKey(m)){
                hm.put(m, hm.get(m) + 1);
            } else {
                hm.put(m, 1);
            }
        }

        return pairs;
    }
}

    
}
