public class DisplayLongestNameGfg {


class Solution {
    public String longest(List<String> arr) {
        int n = arr.size(); 
        int max_length = Integer.MIN_VALUE;
        int max_index = -1;
        
        for (int i = 0; i < n; i++) {
            int nn = arr.get(i).length(); 
            if (nn > max_length) {
                max_length = nn;
                max_index = i;
            }
        }
        
        return arr.get(max_index); 
    }
}

    
}
